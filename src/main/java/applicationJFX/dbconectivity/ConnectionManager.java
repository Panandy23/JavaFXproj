package applicationJFX.dbconectivity;

import java.sql.*;

public class ConnectionManager {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/mydb?useLegacyDatetimeCode=false&serverTimezone=Europe/Warsaw";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Bydgoszcz01!";
    //private static Connection CON=null;

    private static Connection dbConnect(){
        Connection con = null;

        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    private static void closeConnection(Connection connection){

        try {
            if (connection != null && connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static ResultSet dbExecuteQuery(String query){

        Connection connection = dbConnect();
        ResultSet resultSet = null;

        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }
        return resultSet;
    }

}
