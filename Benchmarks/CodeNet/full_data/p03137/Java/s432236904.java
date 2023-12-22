import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] list = new int[m];

        for (int i = 0; i < m ; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        int sum = 0;

        for (int i = 0; i < m - 1; i++) {
            int gap = Math.abs(list[i + 1] - list[i]);
            queue.add(gap);
            sum += gap;
        }

        for (int i = 0; i < n - 1 ; i++) {
            if (queue.size() == 0) {
                break;
            }
            sum -= queue.poll();
        }

        System.out.println(sum);
    }
}