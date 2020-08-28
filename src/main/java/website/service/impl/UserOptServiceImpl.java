package website.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import website.mapper.UserMapper;
import website.pojo.User;
import website.service.UserOptService;

@Service
public class UserOptServiceImpl implements UserOptService {
    @Autowired
    private UserMapper userDao;

    public User selectUserById(int userId) {
        return userDao.selectUserById(userId);
    }


    public void userRegister(User user) {
        userDao.addUserById(user);
    }

    public User userLogin(String userName, String userPwd) {
        User user = userDao.findByUserName(userName, userPwd);
        if (user != null && user.getUserPwd().equals(userPwd)){
            return user;
        }
        return null;
    }
}
