package Accounts;

public class User_Information {

    private int account_ID;
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;

    //Default constructor with no parameters
    public User_Information() {
        this.account_ID = 0;
        this.name = "name";
        this.address = "address";
        this.city = "city";
        this.state = "state";
        this.zip = 0;
    }

    //Default constructor with parameters. User inputs email and password or inputted into this method
    //and are then saved
    public User_Information(int a, String n, String ad, String c, String s, int z){

        this.account_ID = a;
        this.name = n;
        this.address = ad;
        this.city = c;
        this.state = s;
        this.zip = z;
    }

    //getter and setters for accessing the private member variables


    public int getAccount_ID() {
        return account_ID;
    }

    public void setAccount_ID(int account_ID) {
        this.account_ID = account_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
