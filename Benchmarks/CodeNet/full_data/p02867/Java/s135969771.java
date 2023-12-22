import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        V[] vs = new V[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            vs[i] = new V(A[i], i);
        }
        int invert = 0;
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
            if (A[i] > B[i]) invert++;
        }
//        if (invert >= N - 1) {
//            System.out.println("No");
//            return;
//        }
        Arrays.sort(A);
        Arrays.sort(B);
        boolean ok = false;
        for (int i = 0; i < N; i++) {
            if (A[i] > B[i]) {
                System.out.println("No");
                return;
            }
            if (i > 0 && A[i] <= B[i - 1]) {
                ok = true;
            }
        }
        Arrays.sort(vs);
        boolean[] visited = new boolean[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            int pos = i;
            while (!visited[pos]) {
                visited[pos] = true;
                pos = vs[pos].p;
            }
            ++count;
        }
        System.out.println(count == 1 ? "No" : "Yes");
    }

    static class V implements Comparable<V> {
        int v, p;

        public V(int v, int p) {
            this.v = v;
            this.p = p;
        }

        @Override
        public int compareTo(V o) {
            return Integer.compare(this.v, o.v);
        }
    }


}
