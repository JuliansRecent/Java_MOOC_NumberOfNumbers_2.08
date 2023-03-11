
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // store variable for the count of numbers inputted outside of the loop
        int countOfInputs = 0;

        // prompt the user for numbers in a loop
        while (true) {

            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // if number given is not 0, add 1 to the count of inputs
            if (number != 0) {
                countOfInputs = countOfInputs + 1;
            // if number given is 0, print the count of inputs and break the loop
            } else {
                System.out.println("Number of numbers: " + countOfInputs);
                break;
            }
        }
    }
}
