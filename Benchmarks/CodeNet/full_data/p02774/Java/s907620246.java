import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), K = in.nextInt();
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = in.nextInt();
        }
        Arrays.sort(X);
        int neg = 0, zero = 0;
        for (int x : X) {
            if (x < 0) neg++;
            else if (x == 0) zero++;
            else break;
        }
        int pos = X.length - neg - zero;
        int posStart = neg + zero;
        int negSum = neg * pos, zeroSum = (X.length * 2 - 1 - zero) * zero / 2;
        if (negSum > K) {
            PriorityQueue<long[]> q = new PriorityQueue<>(Comparator.comparing(x -> x[0]));
            for (int i = 0; i < neg; i++) {
                q.add(new long[]{(long) X[i] * X[X.length-1], X[i], X.length-1});
            }
            while (--K > 0) {
                long[] poll = q.poll();
                if (poll[2] > posStart) {
                    q.add(new long[]{poll[1] * X[(int)poll[2]-1], poll[1], poll[2]-1});
                }
            }
            System.out.println(q.poll()[0]);
        } else if (negSum + zeroSum >= K) {
                System.out.println(0);
        } else {
            K -= negSum + zeroSum;
            PriorityQueue<long[]> q = new PriorityQueue<>(Comparator.comparing(x -> x[0]));
            for (int i = neg - 1; i > 0; i--) {
                q.add(new long[]{(long) X[i] * X[i-1], X[i], i-1});
            }
            for (int i = posStart; i < X.length - 1; i++) {
                q.add(new long[]{(long) X[i] * X[i+1], X[i], i+1});
            }
            while (--K > 0) {
                long[] poll = q.poll();
                if (poll[2] > 0 && poll[2] < neg) {
                    q.add(new long[]{poll[1] * X[(int)poll[2]-1], poll[1], poll[2]-1});
                } else if (poll[2] >= posStart && poll[2] < X.length - 1) {
                    q.add(new long[]{poll[1] * X[(int)poll[2]+1], poll[1], poll[2]+1});
                }
            }
            System.out.println(q.poll()[0]);
        }
    }
}