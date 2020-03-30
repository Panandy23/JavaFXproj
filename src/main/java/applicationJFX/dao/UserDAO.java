package applicationJFX.dao;

import applicationJFX.dbconectivity.ConnectionManager;
import applicationJFX.model.User;


import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAO {

    private static final String SELECT = "SELECT";
    private static final String FROM_USER = "FROM USER";
    private static final String ID_USER = "idUser";
    private static final String USER_NAME = "UserName";
    private static final String USER_PASSWORD = "UserPassword";
    private static final String FIRST_NAME = "FirstName";
    private static final String LAST_NAME = "LastName";
    private static final String WHERE = "WHERE";

    public User selectUserByUserName(String userName) throws SQLException {
        User user = new User();
        String query = SELECT + " * " + FROM_USER + " " + WHERE + " " + USER_NAME+"="+"'"+userName+"'";

        ResultSet resultSet = ConnectionManager.dbExecuteQuery(query);
        while(resultSet.next()){

            user.setUserId(resultSet.getInt(ID_USER));
            user.setUserName(resultSet.getString(USER_NAME));
            user.setPassword(resultSet.getString(USER_PASSWORD));
            user.setFirstName(resultSet.getString(FIRST_NAME));
            user.setLastName(resultSet.getString(LAST_NAME));
        }
        return user;
    }

}
