import java.util.Scanner;

public class WEEK4_Q3 {

    public static boolean containsDuplicate(int[] nums) {

        // Compare every element with every other element
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // Check if two different positions have the same value
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        // No duplicate found
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Check for duplicates
        boolean result = containsDuplicate(nums);

        // Print result
        System.out.println(result);

        sc.close();
    }
}