package applicationJFX.service;

import applicationJFX.dao.UserDAO;
import applicationJFX.model.User;

import java.sql.SQLException;

public class UserService {

    private UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAO();
    }

    public boolean isUserValid(String userName, String password){
        User user = null;
        boolean isUserName = false;
        boolean isPassword = false;

        try {
            user = userDAO.selectUserByUserName(userName);
            isUserName = userName.equalsIgnoreCase(user.getUserName());
            isPassword = password.equalsIgnoreCase(user.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (isUserName && isPassword);
    }
}
