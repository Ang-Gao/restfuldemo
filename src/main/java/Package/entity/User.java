package Package.entity;

public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private Integer userAge;
    //constructors
    public User(){};
    public User(Integer userId, String userName, String userPassword, Integer userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userAge = userAge;
    }
    //getter and setter
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getAge() {
        return userAge;
    }

    public void setAge(Integer age) {
        this.userAge = age;
    }
}
