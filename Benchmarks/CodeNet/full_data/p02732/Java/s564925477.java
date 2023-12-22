import java.util.*;

class Main {

    static public long[] solve(int N, int[] A) {
        int[] d = new int[N+1];
        for (int n : A) d[n]++;
        
        long sum = 0;
        for (long v : d) {
            sum += v*(v-1)/2;
        }

        long[] res = new long[N];
        int i = 0;
        for (int n : A) {
            res[i++] = (d[n]==1) ? sum : (sum-d[n]+1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        for (long n : solve(N, A))
            System.out.println(n);
    }
}