package consoleui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteHandler {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void handle() {
        System.out.println("You can at any time type \"<\" to cancel.");
        System.out.println("Please select ID of review to delete");
        String input = null;
        int id = -1;
        while (input == null) {
            input = getInput();
            if (input == null) continue;
            if ("<".equals(input)) return;
            try {
                id = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                input = null;
            }
            if (id < 0) {
                System.out.println("Input must be a positive integer.");
                input = null;
            }
        }
        System.out.println("Review deleted.");
    }

    private String getInput() {
        String optionSelected;
        try {
            optionSelected = reader.readLine();
        } catch (IOException e) {
            System.out.println("Error reading input, please try again.\n\n");
            return null;
        }
        return optionSelected;
    }
}
