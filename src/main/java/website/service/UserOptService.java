package website.service;

import website.pojo.User;

public interface UserOptService {
    public User selectUserById(int userId);
    public void userRegister(User user);
    public User userLogin(String userName, String userPwd);
}
