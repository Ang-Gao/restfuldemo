package Package.util;

import Package.entity.User;
import Package.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class UserMapperImp {
    SqlSession session = GetSqlSession.createSqlSession();
    static UserMapper imp;
    {
        assert session != null;
        imp = session.getMapper(UserMapper.class);
    }

    public User queryUserById(Integer id){
        return imp.queryUserById(id);
    }

    public void deleteUser(Integer id){
        imp.deleteUser(id);
    }

    public void updateUser(Integer userId, String userName,String userPassword,Integer userAge){
        imp.updateUser(userId,userName,userPassword,userAge);
    }

    public void insertUser(String userName,String userPassword,Integer userAge){
        imp.insertUser(userName,userPassword,userAge);
    }

    public List<User> getAllUsers(){
        List<User> list = new ArrayList<>();
        list = imp.getAllUsers();
        return list;
    }
    public void close(){
        session.commit();
        session.close();
    }
}
