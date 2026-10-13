class PiggyBank {

    private double savings;
    private final String id;

    // Constructor
    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0;
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Deposit rejected: Amount must be positive");
        } else {
            savings = savings + amount;
            System.out.println("Deposit successful. Savings: " + savings);
        }
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal rejected: Amount must be positive");
        } else if (amount > savings) {
            System.out.println("Withdrawal rejected: Insufficient savings");
        } else {
            savings = savings - amount;
            System.out.println("Withdrawal successful. Savings: " + savings);
        }
    }

    // Get current savings
    public double getSavings() {
        return savings;
    }

    // Get piggy bank ID
    public String getId() {
        return id;
    }
}

public class WEEK7Q1 {

    public static void main(String[] args) {

        PiggyBank pb = new PiggyBank("PB-1");

        pb.deposit(100);

        pb.withdraw(30);

        pb.withdraw(500);

        System.out.println("Piggy Bank ID: " + pb.getId());
        System.out.println("Final savings: " + pb.getSavings());
    }
}