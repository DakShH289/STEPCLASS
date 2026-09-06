import java.util.Scanner;

public class WEEK3_ASSIGNMENTQ11 {

    static void printNumberPyramid(int n) {

        // Outer loop controls the rows
        for (int i = 1; i <= n; i++) {

            // Inner loop prints the row number i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        printNumberPyramid(n);

        sc.close();
    }
}