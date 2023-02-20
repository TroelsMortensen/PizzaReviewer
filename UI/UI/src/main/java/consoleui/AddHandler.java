package consoleui;

import models.Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddHandler {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void handle() {
        Review review = new Review();
        System.out.println("You can at any time type \"<\" to cancel.");
        System.out.println("Please input restaurent name..");
        String input = null;
        while (input == null) {
            input = getInput();
        }
        if (input.equals("<")) {
            return;
        }
        review.changeRestaurentName(input);

        System.out.println("Review successfully added");
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
