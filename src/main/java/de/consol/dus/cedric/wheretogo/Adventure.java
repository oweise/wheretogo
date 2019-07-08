package de.consol.dus.cedric.wheretogo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Adventure {

    private Place currentPlace;

    public Adventure() throws IOException {

        Place hall = new Place("hall");
        currentPlace = hall;

    }

    public void run() throws NullPointerException, URISyntaxException, IOException {

        System.out.println("Welcome to 'where-to-go'");

        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println(currentPlace.getDescription());
            System.out.print("> ");
            command = scanner.next();

            if ("quit".equals(command)) {
                break;
            }
        }
        while (true);

        System.out.println("Bye!");

    }


}
