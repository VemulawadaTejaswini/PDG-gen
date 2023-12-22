import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int left = 0; left <= n && left <= k; left++) {
            for (int right = 0; left + right <= n && left + right <= k; right++) {
                for (int i = 0; i < left; i++) {
                    queue.add(arr[i]);
                }
                for (int i = 0; i < right; i++) {
                    queue.add(arr[n - i - 1]);
                }
                for (int i = 0; i < k - left - right && queue.size() > 0 && queue.peek() < 0; i++) {
                    queue.poll();
                }
                int sum = 0;
                while (queue.size() > 0) {
                    sum += queue.poll();
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}