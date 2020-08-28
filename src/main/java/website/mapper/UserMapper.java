package website.mapper;

import website.pojo.User;

public interface UserMapper {
    public User selectUserById(int userId);
    public void addUserById(User user);
    public User findByUserName(String userName, String userPwd);
}
