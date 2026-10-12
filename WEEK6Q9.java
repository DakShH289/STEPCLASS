class HallTicket {

    String studentName;
    int seatNumber;

    // Constructor
    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class WEEK6Q9 {

    public static void main(String[] args) {

        // Create one HallTicket object
        HallTicket priya = new HallTicket("Priya", 0);

        // Both variables point to the same object
        HallTicket copy = priya;

        // Change seat number using copy
        copy.seatNumber = 45;

        // Create a separate object with the same values
        HallTicket separate = new HallTicket("Priya", 45);

        // Print seat number through the first variable
        System.out.println(
                "Priya's seatNumber (via first variable): "
                + priya.seatNumber
        );

        // Compare object references
        System.out.println("copy == priya: " + (copy == priya));

        System.out.println("separate == priya: " + (separate == priya));
    }
}