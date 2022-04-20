package Package.controller;

import Package.entity.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
    @RequestMapping("/test1")
    public String testTest(@RequestBody String requestBody,RequestEntity<String> requestEntity){
        System.out.println(requestBody);
        System.out.println(requestEntity.getHeaders());
        return "success";
    }
    @RequestMapping("/json")
    @ResponseBody
    public User userJson(){
        return new User(100,"gao","123bc",22);
    }
}
