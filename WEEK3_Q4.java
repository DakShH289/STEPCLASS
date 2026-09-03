import java.util.Scanner;

public class WEEK3_Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number2: ");
        int number2 = input.nextInt();

        int origNumber1 = number1;
        int origNumber2 = number2;

        while (number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }

        System.out.println("The GCD of " + origNumber1 + " and " + origNumber2 + " is " + number1);

        input.close();
    }
}