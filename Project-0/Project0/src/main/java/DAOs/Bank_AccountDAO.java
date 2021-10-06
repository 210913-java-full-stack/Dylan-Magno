package DAOs;

import Accounts.Bank_Account;
import Utils.ConnectionManager;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Bank_AccountDAO<T> implements Bank_AccountCRUD {

    private static Connection conn;

    static {
        try {
            conn = ConnectionManager.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Bank_Account row) throws SQLException {

        String sql = "insert into Bank_Account (user_ID, bankAccount_ID, balance) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, row.getUserAccount_ID());
        pstmt.setInt(2, row.getBankAccount_ID());
        pstmt.setDouble(3, row.getBalance());
    }

    @Override
    public Bank_Account getByID(int user_ID) throws SQLException {
        String sql = "SELECT * FROM Bank_Account WHERE user_ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, user_ID);

        ResultSet rs = pstmt.executeQuery();

        if(rs.next()) {
            return new Bank_Account(rs.getInt("user_ID"), rs.getInt("bankAccount_ID"), rs.getBigDecimal("balance"));
        } else {
            return null;
        }
    }

    @Override
    public List<Bank_Account> getAllAccounts() throws SQLException {

        String sql = "SELECT * FROM Bank_Account";
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        List<Bank_Account> resultList = new ArrayList<>();

        while(rs.next()) {
            Bank_Account newItem = new Bank_Account(rs.getInt("user_ID"), rs.getInt("bankAccount_ID"), rs.getBigDecimal("balance"));
            resultList.add(newItem);
        }

        return resultList;

    }

    @Override
    public void deleteByID(int id) throws SQLException {

        String sql = "DELETE FROM Bank_Account WHERE user_ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);

        pstmt.executeUpdate();

    }
}
