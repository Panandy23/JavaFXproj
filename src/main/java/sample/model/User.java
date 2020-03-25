package sample.model;

public class User {

    private String login;
    private String password;

    private static User exampleUser = new User("Andy", "Andy");


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static User getExampleUser() {
        return exampleUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\''+
                '}';
    }
}
