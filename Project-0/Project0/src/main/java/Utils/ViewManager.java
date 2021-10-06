package Utils;

import java.util.Scanner;

public class ViewManager {
    private ViewManager() {
        viewManager = this;
        running = true;
        conn = ConnectionManager.getConnection();
        scanner = new Scanner(System.in);
        viewList = new MyLinkedList<>();


        //set up views
        viewList.add(new MainMenu(scanner));
        viewList.add(new MarkItemComplete(scanner));
        viewList.add(new ViewToDoItems(scanner));
    }

    public static ViewManager getViewManager() {
        if(viewManager == null) {
            viewManager = new ViewManager();
        }
        return viewManager;
    }
}
