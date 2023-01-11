package consoleui;

import jsondata.DataAccess;

public class ConsoleUI {


    private final DataAccess dataAccess;

    public ConsoleUI(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public void run() {
        showMainMenu();
    }


    private void showMainMenu(){
        new MainMenuHandler().showMainMenu();
        System.out.println("Bye bye");
    }

}
