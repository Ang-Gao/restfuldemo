package Package.mapper;

import Package.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public User queryUserById(Integer id);
    public void deleteUser(Integer id);
    public void updateUser(@Param("userId") Integer userId,@Param("userName") String userName, @Param("userPassword") String userPassword, @Param("userAge") Integer userAge);
    public void insertUser(@Param("userName") String userName, @Param("userPassword") String userPassword, @Param("userAge") Integer userAge);
    public List<User> getAllUsers();
}
