class NameTag {

    private final String firstName;
    private final String lastInitial;

    // Constructor
    public NameTag(String fullName) {

        String[] parts = fullName.split(" ");

        firstName = parts[0];
        lastInitial = parts[1].substring(0, 1);
    }

    // Return nickname
    public String getNickname() {

        return firstName + " " + lastInitial + ".";
    }
}

public class WEEK7Q3 {

    public static void main(String[] args) {

        NameTag tag = new NameTag("Maria Gomez");

        System.out.println(tag.getNickname());

        // Create another separate object
        NameTag tag2 = new NameTag("Maria Gomez");

        System.out.println(tag == tag2);
    }
}