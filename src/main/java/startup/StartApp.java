package startup;

import consoleui.ConsoleUI;
import jsondata.DataAccess;
import jsondata.JsonDataAccess;

public class StartApp {

    public static void main(String[] args) {
        DataAccess dataAccess = new JsonDataAccess();
        ConsoleUI ui = new ConsoleUI(dataAccess);
        ui.run();
        // just a push test.
    }

}
