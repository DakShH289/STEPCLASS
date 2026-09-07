import java.util.Scanner;

public class WEEK3_ASSIGNMENTQ14 {

    static void generateFirstValidTable(int[] candidates) {

        // Loop through all candidate numbers
        for (int i = 0; i < candidates.length; i++) {

            // Check if the number is invalid
            if (candidates[i] < 1) {
                System.out.println("Skipping invalid number: " + candidates[i]);
                continue;
            }

            // Valid number found - print its table
            for (int j = 1; j <= 10; j++) {
                System.out.println(candidates[i] + " x " + j + " = " 
                                   + (candidates[i] * j));
            }

            // Stop after the first valid number
            break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();

        int[] candidates = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter candidate " + (i + 1) + ": ");
            candidates[i] = sc.nextInt();
        }

        generateFirstValidTable(candidates);

        sc.close();
    }
}