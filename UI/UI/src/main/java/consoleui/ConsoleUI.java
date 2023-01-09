package consoleui;

import jsondata.DataAccess;

public class ConsoleUI
{

    private final DataAccess dataAccess;

    public ConsoleUI(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public void run(){
        System.out.println("Running super fast, going nowhere.");
    }

    // TODO i should remember to do something here. It's importantn.
}
