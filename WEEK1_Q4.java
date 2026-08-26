import java.util.Scanner;

public class WEEK1_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a CSV line: ");
        String line = sc.nextLine();

        String[] fields = line.split(",");

        System.out.println("Fields:");
        for (String field : fields) {
            System.out.println(field.trim());
        }

        sc.close();
    }
}