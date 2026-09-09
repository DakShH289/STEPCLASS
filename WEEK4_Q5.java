import java.util.Arrays;

public class WEEK4_Q5 {

    public static int[] rotateArray(int[] nums, int k) {

        // Reduce k if it is greater than array length
        k = k % nums.length;

        // Create a new array
        int[] newArray = new int[nums.length];

        // Place each element at its new position
        for (int i = 0; i < nums.length; i++) {
            newArray[(i + k) % nums.length] = nums[i];
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] result = rotateArray(nums, k);

        System.out.println(Arrays.toString(result));
    }
}