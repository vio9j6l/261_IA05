/*
 * Name: JiaJia Liu
 * Email: jpl5840@psu.edu
 * Course: IST 261
 * Assignment: IA05
 */

import java.util.Scanner;

public class IOHelper {
    private static final Scanner keyboard = new Scanner(System.in);

    public static String userInputString(String x) {
        System.out.print(x + ": ");

        return keyboard.nextLine();
    }

    public static int userInputInt(String x) {
        Integer o = null;

        while (o == null) {
            String u = userInputString(x);
            o = ValidationHelper.tryParseInt(u);
        }

        return o;
    }

    public static char userInputChar(String x, String r) {

        char c = 0;
        while (!ValidationHelper.isCharAllowed(c, r)) {
            String i = userInputString(x + " (" + r + ")");
            if (i.length() > 0) {
                c = i.charAt(0);
            }
        }

        return c;
    }
}
