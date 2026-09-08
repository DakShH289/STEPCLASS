import java.util.Arrays;
import java.util.Scanner;

public class WEEK4_Q1 {

    public static int[] twoSum(int[] nums, int target) {

        // Check every possible pair
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // Check if the pair adds up to target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // This will never be reached because a valid pair is guaranteed
        return new int[]{};
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

        // Input target
        int target = sc.nextInt();

        // Find the two indices
        int[] result = twoSum(nums, target);

        // Print the result
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}