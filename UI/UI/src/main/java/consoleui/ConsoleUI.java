package consoleui;

import jsondata.DataAccess;

public class ConsoleUI
{

    private final DataAccess dataAccess;

    public ConsoleUI(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public void run(){
        try {
            System.out.println("Running super fast, going nowhere.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
