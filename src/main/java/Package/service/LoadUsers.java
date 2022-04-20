package Package.service;

import Package.entity.User;
import Package.util.UserMapperImp;

import java.util.List;

//load user data from database
public class LoadUsers {
    public static List<User> loadUsers(){
        UserMapperImp userMapperImp = new UserMapperImp();

        return userMapperImp.getAllUsers();
    }
}
