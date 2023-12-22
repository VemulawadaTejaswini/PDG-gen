import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] k = new int[M];
        List<Integer>[] S = new ArrayList[M];
        int[] p = new int[M];
        for (int i=0; i<M; i++) {
            k[i] = sc.nextInt();
            S[i] = new ArrayList<>();
            for (int j=0; j<k[i]; j++) {
                S[i].add(sc.nextInt());
            }
        }
        for (int i=0; i<M; i++) {
            p[i] = sc.nextInt();
        }

        System.out.println(solve(N, M, k, S, p));
    }

    public static int solve(int N, int M, int[] k, List<Integer>[] s, int[] p) {
        int count = 0;

        for (int i=0; i<Math.pow(2, N); i++) {
            boolean on = true;
            for (int j=0; j<M; j++) {
                if (!isOn(N, i, k[j], s[j], p[j])) {
                    on = false;
                    break;
                }
            }
            // System.err.println("i=" + i + ", on = " + on);
            if (on) count++;
        }

        return count;
   }

   private static boolean isOn(int N, int state, int k, List<Integer> s, int p) {
        int count = 0;

        for (int i=0; i<k; i++) {
            count += getStatus(state, s.get(i));
        }

        // System.err.println("state=" + state + ", count=" + count + ", p=" + p);
        return count%2 == p;
   }

   private static int getStatus(int status, int idx) {
        // System.err.println("status=" + status + " index=" + idx + " is " + ((status>>idx)%2));
        return (status >> (idx-1)) %2;
   }
}