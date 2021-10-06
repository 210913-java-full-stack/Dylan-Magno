package DAOs;

import Accounts.User_Account;

import java.sql.SQLException;
import java.util.List;

public class User_AccountDAO implements User_AccountCRUD {
    @Override
    public void save(Object row) throws SQLException {

    }

    @Override
    public Object getByID(int id) throws SQLException {
        return null;
    }

    @Override
    public List getAllAccounts() throws SQLException {
        return null;
    }

    @Override
    public void deleteByID(int id) throws SQLException {

    }
}
