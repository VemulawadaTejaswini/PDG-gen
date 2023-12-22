import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[n];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list[i] = value;
            queue.add(value);
        }

        for (int i = 0; i < n; i++) {
            if (queue.peek() != list[i]) {
                System.out.println(queue.peek());
            } else {
                int max = queue.peek();
                queue.poll();
                System.out.println(queue.peek());
                queue.add(max);
            }
        }
    }
}