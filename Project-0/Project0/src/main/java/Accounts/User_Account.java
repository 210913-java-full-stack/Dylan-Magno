package Accounts;

public class User_Account {
    private int userAccount_ID;
    private String user_Email;
    private String login_username;
    private String login_password;

    //Default constructor with no parameters
    public User_Account() {
        this.userAccount_ID = 0;
        this.user_Email = "email";
        this.login_username = "username";
        this.login_password = "password";
    }

    //Default constructor with parameters. User inputs email and password or inputted into this method
    //and are then saved
    public User_Account(int a, String e, String u, String p){

        this.user_Email = e;
        this.userAccount_ID = a;
        this.login_username = u;
        this.login_password = p;
    }

    //getter and setters for accessing the private member variables


    public int getAccount_ID() {
        return userAccount_ID;
    }

    public void setAccount_ID(int account_ID) {
        this.userAccount_ID = account_ID;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }

    public String getLogin_username() {
        return login_username;
    }

    public void setLogin_username(String login_username) {
        this.login_username = login_username;
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }
}
