import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        long ans = 0;
        for (int torukazu = 0; torukazu <= k; torukazu++) {
            int tumerukazu = k - torukazu;
            for (int hidarikara = 0; hidarikara <= torukazu; hidarikara++) {
                int migikara = torukazu - hidarikara;

                PriorityQueue<Integer> queue = new PriorityQueue<>();
                int[] v_copy = Arrays.copyOf(v, v.length);

                for (int i = 0; i < Math.min(hidarikara, n); i++) {
                    queue.add(v_copy[i]);
                    v_copy[i] = 0;
                }
                for (int i = 0; i < Math.min(migikara, n); i++) {
                    queue.add(v_copy[n-1-i]);
                    v_copy[n-1-i] = 0;
                }

                for (int i = 0; i < tumerukazu; i++) {
                    Integer e = queue.peek();
                    if(e == null) break;
                    if(e <= 0) queue.poll();
                }
                long sum = 0L;
                for (int p : queue) {
                    sum += p;
                }
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }
}