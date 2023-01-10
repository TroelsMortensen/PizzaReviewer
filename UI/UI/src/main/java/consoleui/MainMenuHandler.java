package consoleui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenuHandler {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void showMainMenu() {

        outer:
        while (true) {
            displayOptions();


            String optionSelected = getInput(reader);
            if (optionSelected == null) continue;

            switch (optionSelected) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "<":
                    break outer;
                default:
                    System.out.println("Invalid command, please try again\n\n");
            }
        }
    }

    private String getInput(BufferedReader reader) {
        String optionSelected;
        try {
            optionSelected = reader.readLine();
        } catch (IOException e) {
            System.out.println("Error reading input, please try again.\n\n");
            return null;
        }
        return optionSelected;
    }

    private void displayOptions() {
        System.out.println("Main menu:");
        System.out.println("1) Add review");
        System.out.println("2) Update review");
        System.out.println("3) Delete review");
        System.out.println("4) See reviews");
        System.out.println("<) Exit");
    }
}
