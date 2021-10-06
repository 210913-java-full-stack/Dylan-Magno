import Exceptions.myException;
import Utils.ConnectionManager;
import Utils.ViewManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;


//Starting point of the program
public class main {
    public static void main(String[] args) {

        ViewManager viewManager = ViewManager.getViewManager();


        //Scanner object used to accept console input from the user
        Scanner sc = new Scanner(System.in);

        //Tests connection, if connection fails print the stack trace.
        try {
            Connection conn = ConnectionManager.getConnection();

        } catch (SQLException | IOException e) {
            e.printStackTrace();

        }

        System.out.println("Connected!");



    }
}