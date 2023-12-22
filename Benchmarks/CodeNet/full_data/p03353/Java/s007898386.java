import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        String s = sc.next();
        int k = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j <= k; j++) {
                if (i + j > s.length()) {
                    continue;
                }
                set.add(s.substring(i, i + j));
            }
        }
        PriorityQueue<String> q = new PriorityQueue<>(set);
        for (int i = 0; i < k-1; i++) {
            q.poll();
        }
        System.out.println(q.poll());
    }
}
