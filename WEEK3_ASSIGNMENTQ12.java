import java.util.Scanner;

public class WEEK3_ASSIGNMENTQ12 {

    static void atmPinRetry(String correctPin, String[] attempts) {

        int attemptCount = 0;
        boolean success = false;

        while (attemptCount < attempts.length && attemptCount < 3 && !success) {

            if (attempts[attemptCount].equals(correctPin)) {
                success = true;
                System.out.println("PIN accepted");
                break;
            }

            attemptCount++;
        }

        if (!success) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter correct PIN: ");
        String correctPin = sc.nextLine();

        System.out.print("Enter number of attempts (up to 3): ");
        int n = sc.nextInt();

        String[] attempts = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter attempt " + (i + 1) + ": ");
            attempts[i] = sc.next();
        }

        atmPinRetry(correctPin, attempts);

        sc.close();
    }
}