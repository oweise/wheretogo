package de.consol.dus.cedric.wheretogo;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            new Adventure().run();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
