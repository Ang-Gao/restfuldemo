package Package.controller;

import Package.entity.User;
import Package.service.LoadUsers;
import Package.util.UserMapperImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UsersController {
    @RequestMapping(value ="/users")
    public String users(Model model){

        List<User> users = LoadUsers.loadUsers();
        model.addAttribute("list",users);
        return "users";
    }
    //创建域对象，然后在html中${}引用
    @RequestMapping(value = "/update/{userId}",method = RequestMethod.GET)
    public String update(@PathVariable("userId")Integer userId,Model model){
        UserMapperImp userMapperImp = new UserMapperImp();

        User user = userMapperImp.queryUserById(userId);
        model.addAttribute("user",user);
        return "update";
    }
    //update and save
    @RequestMapping(value ="/users",method = RequestMethod.PUT)
    public String usersUpdate(User user){
        UserMapperImp userMapperImp = new UserMapperImp();

        Integer userId = user.getUserId();
        String userName = user.getUserName();
        String userPassword = user.getUserPassword();
        userMapperImp.updateUser(userId,userName,userPassword,0);
        userMapperImp.close();
        return "redirect:/users";
    }

    //delete
    @RequestMapping(value ="/delete/{userId}",method = RequestMethod.DELETE)
    public String usersDelete(@PathVariable("userId")Integer userId){
        UserMapperImp userMapperImp = new UserMapperImp();
        userMapperImp.deleteUser(userId);
        userMapperImp.close();
        return "redirect:/users";
    }
    //add
    @RequestMapping(value = "/add")
    public String add(){

        return "add";
    }
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public String addUser(String userName,String userPassword){

        UserMapperImp userMapperImp = new UserMapperImp();
        userMapperImp.insertUser(userName,userPassword,0);
        userMapperImp.close();
        return "redirect:/users";
    }

}
