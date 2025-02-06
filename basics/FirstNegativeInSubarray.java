public class 5 {
    import java.util.*;

public class FirstNegativeInSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Take window size input
        System.out.print("Enter the window size (k): ");
        int k = scanner.nextInt();

        System.out.println("First negative number in each subarray:");
        findFirstNegative(arr, n, k);

        scanner.close();
    }

    public static void findFirstNegative(int[] arr, int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Add current negative element's index to the queue
            if (arr[i] < 0) {
                queue.add(i);
            }

            // Process the window after the first valid index
            if (i >= k - 1) {
                // Remove indices outside the current window
                while (!queue.isEmpty() && queue.peek() < i - k + 1) {
                    queue.poll();
                }

                // Print the first negative in the current window or 0 if none exists
                if (!queue.isEmpty()) {
                    System.out.print(arr[queue.peek()] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
        }
    }
}

    
}
