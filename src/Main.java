/*
 * Name: JiaJia Liu
 * Email: jpl5840@psu.edu
 * Course: IST 261
 * Assignment: IA05
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Name: JiaJia Liu");
        System.out.println("Email: jpl5840@psu.edu");
        System.out.println("Course: IST 261");
        System.out.println("Assignment: IA05");

        int operandOne = IOHelper.userInputInt("Enter first numeric value");
        int operandTwo = IOHelper.userInputInt("Enter second numeric value");
        char operation = IOHelper.userInputChar("Choose an operation", "+-");

        double result;
        switch (operation) {
            case '+':
                result = MathHelper.addValues(operandOne, operandTwo);
                break;
            case '-':
                result = MathHelper.subtractValues(operandOne, operandTwo);
                break;
            default:
                System.out.println("Unrecognized operation!");
                return;
        }
        System.out.println("The answer is " + result);
    }
}
