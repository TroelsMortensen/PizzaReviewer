package consoleui;

import jsondata.DataAccess;

public class ConsoleUI {

    private final DataAccess dataAccess;

    public ConsoleUI(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public void run() {
        System.out.println("Running super fast, going nowhere.");
    }

}
