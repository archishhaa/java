import java.util.Scanner;

public class 4 {

    /**
     * Problem Statement:
     * Given an integer array `prices[]` where the i-th element represents the price of a stock on day i,
     * write a function to find the maximum profit you can achieve.
     * You are allowed to complete as many transactions as you like (buy one and sell one share multiple times).
     * However, you may not engage in multiple transactions simultaneously (you must sell the stock before buying again).
     *
     * Example:
     * Input:
     * Number of days: 6
     * Prices: [7, 1, 5, 3, 6, 4]
     *
     * Output:
     * Maximum Profit: 7
     *
     * Explanation:
     * Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
     * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
     * Total Profit = 4 + 3 = 7.
     */
     
    // Function to calculate maximum profit
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        // Loop through the prices and look for ascending trends
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for stock prices
        System.out.println("Enter the number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter the stock prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);

        scanner.close();
    }
}
