import java.util.Scanner;

public class WEEK4_Q2 {

    public static int maxProfit(int[] prices) {

        // Store the lowest price seen so far
        int minPrice = prices[0];

        // Store the maximum profit found so far
        int maxProfit = 0;

        // Start from the second day
        for (int i = 1; i < prices.length; i++) {

            // Update the minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit if we sell today
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Input stock prices
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Find maximum profit
        int result = maxProfit(prices);

        // Print result
        System.out.println(result);

        sc.close();
    }
}