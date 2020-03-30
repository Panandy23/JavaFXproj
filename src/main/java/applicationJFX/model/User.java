package applicationJFX.model;

public class User {

    private int userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    private static User exampleUser = new User("Andy", "Andy", "Andrzej", "Pawlowski");

    public User() {
    }

    public User(String userName, String password, String firstName, String lastName) {

        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
                "userId=" + userId +
                ", login='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
