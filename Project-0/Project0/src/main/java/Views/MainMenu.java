package Views;

import java.util.Scanner;

public class MainMenu {

    public MainMenu(Scanner scanner) {
        super("MainMenu", scanner);
    }

    @Override
    public void renderView() {
        //Write the I/O here, also the navigation based on processing input
        System.out.println("-----Banking System-----\nEnter selection:\n\n1) Register.\n2) Login.\n3) View Accounts\n4) Deposit/Withdraw.\n.\nQ) Quit");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                viewManager.navigate("Register");
                return;
            case "2":
                viewManager.navigate("Login");
                return;
            case "3":
                viewManager.navigate("View Accounts");
                return;
            case "4":
                viewManager.navigate("Deposit_Withdraw");
                return;
            case "Q":
            case "q":
                viewManager.setRunning(false);
                return;
        }
    }
}
