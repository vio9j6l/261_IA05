/*
 * Name: JiaJia Liu
 * Email: jpl5840@psu.edu
 * Course: IST 261
 * Assignment: IA05
 */

public class ValidationHelper {

    public static Integer tryParseInt(String userInput) {
        try {
            return Integer.parseInt(userInput);
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean isCharAllowed(char ch, String r) {
        if (r == null) {
            return false;
        }
        return (r.indexOf(ch) >= 0);
    }
}
