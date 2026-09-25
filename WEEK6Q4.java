class IdCard {

    String name;
    int booksIssued;

    IdCard(String name, int booksIssued) {

        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class WEEK6Q4 {

    public static void main(String[] args) {

        // Create one IdCard object
        IdCard ravi = new IdCard("Ravi", 0);

        // Both variables point to the same object
        IdCard duplicate = ravi;

        // Change the object through duplicate
        duplicate.booksIssued = 3;

        // Create a separate object
        IdCard separate = new IdCard("Ravi", 3);

        // Print booksIssued through first variable
        System.out.println(
                "Ravi's booksIssued (via first variable): "
                + ravi.booksIssued
        );

        // Check whether both variables point to same object
        System.out.println(
                "duplicate == ravi: " + (duplicate == ravi)
        );

        // Check whether separate object is same as ravi
        System.out.println(
                "separate == ravi: " + (separate == ravi)
        );
    }
}