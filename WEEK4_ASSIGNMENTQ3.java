import java.util.*;

public class WEEK4_ASSIGNMENTQ3 {

    static int[][] threeSum(int[] nums) {

        Arrays.sort(nums);

        ArrayList<int[]> result = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate fixed values
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(new int[]{
                        nums[i],
                        nums[left],
                        nums[right]
                    });

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } 
                else if (sum < 0) {

                    left++;

                } 
                else {

                    right--;
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[][] result = threeSum(nums);

        System.out.println("Triplets whose sum is zero:");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                Arrays.toString(result[i])
            );
        }

        sc.close();
    }
}