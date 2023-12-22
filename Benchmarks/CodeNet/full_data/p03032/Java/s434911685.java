import java.util.*;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] V = new int[N];
        for (int i=0; i<N; i++) {
            V[i] = sc.nextInt();
        }

        System.out.println(solve(N, k, V));
    }

    private static long solve(int N, int K, int[] V) {
        long max = 0;
        List<Integer> hold = new ArrayList<>();
        long[] sumLeft = sumLeft(N, V);
        long[] sumRight = sumRight(N, V);
        for (int k=1; k<=K; k++) {
            for (int left=0; left<=k; left++) {
                for (int right=0; right<=k-left; right++) {
                    if (left+right > N) continue;

                    long current = sumLeft[left] + sumRight[right];
                    int maxPush = k-left-right;

                    hold.clear();
                    for (int i=0; i<left; i++) {
                        hold.add(V[i]);
                    }
                    for (int i=0; i<right; i++) {
                        hold.add(V[N-i-1]);
                    }
                    Collections.sort(hold);

                    while (maxPush > 0) {
                        if (hold.size() == 0) break;
                        if( hold.get(0) < 0) {
                            current -= hold.remove(0);
                        }
                        maxPush--;
                    }

                    if (max < current) {
                        // System.err.println("left=" + left + ", right=" + right + ", current=" + current);
                        max = current;
                    }
                }
            }

        }

        return max;
    }

    private static long sum(List<Integer> list) {
        long sum = 0;
        for (int i=0; i<list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    private static long[] sumLeft(int N, int[] V) {
        long[] sum = new long[N+1];
        for (int i=0; i<N; i++) {
            sum[i+1] = V[i] + sum[i];
        }
        return sum;
    }

    private static long[] sumRight(int N, int[] V) {
        long[] sum = new long[N+1];
        for (int i=0; i<N; i++) {
            sum[i+1] = V[N-i-1] + sum[i];
        }
        return sum;
    }
}
