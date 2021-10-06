package DAOs;

import DataStructures.MyArrayList;
import Accounts.User_Information;
import Accounts.User_Account;
import Accounts.Bank_Account;

import java.sql.SQLException;
import java.util.List;

//Interface for setting up DAOs
public interface Bank_AccountCRUD<T> {
//we will need a Connection

    //create
    //save object to database method
    public void save(Bank_Account row) throws SQLException;
    //read
    //query data from database, fill in empty model object
    public T getByID(int id) throws SQLException;
    public List<T> getAllAccounts() throws SQLException;
    //public ToDoItem getItemByKeyword(String keyword); //SELECT * FROM items WHERE message LIKE "%KEYWORD%"
    //update
    // we will use the save() method for updates
    //delete
    //remove by ID
    public void deleteByID(int id) throws SQLException;
}


