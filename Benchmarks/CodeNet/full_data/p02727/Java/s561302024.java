import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question question = new Question();
        question.solve(sc);
    }

    static class Question {
        public void solve(Scanner sc) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            Queue<Integer> reds = new PriorityQueue<>();
            Queue<Integer> greens = new PriorityQueue<>();
            Queue<Integer> colorless = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < x; ++i) reds.offer(sc.nextInt());
            for (int i = 0; i < y; ++i) greens.offer(sc.nextInt());
            for (int i = 0; i < z; ++i) colorless.offer(sc.nextInt());
            while (reds.size() > n) reds.poll();
            while (greens.size() > m) greens.poll();
            while (reds.size() < n && !colorless.isEmpty()) reds.offer(colorless.poll());
            while (greens.size() < m && !colorless.isEmpty()) greens.offer(colorless.poll());
            while (colorless.size() > 0 && Math.min(reds.peek(), greens.peek()) < colorless.peek()) {
                if (reds.peek() < greens.peek()) {
                    reds.poll();
                    reds.offer(colorless.poll());
                }
                else {
                    greens.poll();
                    greens.offer(colorless.poll());
                }
            }
            int sum = 0;
            for (int i : reds) {
                sum += i;
            }
            for (int i : greens) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
