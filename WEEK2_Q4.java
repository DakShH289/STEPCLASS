import java.util.Scanner;

public class WEEK2_Q4 {

    static String normalizeCode(String raw) {

        // Remove leading and trailing spaces
        raw = raw.trim();

        // Convert only first 3 characters to uppercase
        if (raw.length() >= 3) {
            String publisher = raw.substring(0, 3).toUpperCase();
            String rest = raw.substring(3);

            return publisher + rest;
        }

        return raw;
    }

    static String validateAndFormat(String code) {

        // Check length
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        // Check first 3 characters are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        // Check remaining 10 characters are digits
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        // Build formatted output
        StringBuilder result = new StringBuilder();

        result.append("[");
        result.append(code.substring(0, 3));
        result.append("] YEAR: ");
        result.append(code.substring(3, 7));
        result.append(" | CATALOG: ");
        result.append(code.substring(7, 13));

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN code: ");
        String raw = sc.nextLine();

        String normalized = normalizeCode(raw);

        String result = validateAndFormat(normalized);

        System.out.println(result);

        sc.close();
    }
}