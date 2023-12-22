import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        System.out.println(solve(N, A, B) ? YES : NO);
    }

    private static boolean solve(int N, int[] A, int[] B) {
        Job[] job = new Job[N];
        for (int i=0; i<N; i++) {
            job[i] = new Job(A[i], B[i]);
        }

        Arrays.sort(job, Comparator.comparingInt(t -> t.B));

        int time = 0;
        for (int i=0; i<N; i++) {
            if (time <= job[i].B - job[i].A) {
                time += job[i].A;
            } else {
                return false;
            }
        }

        return true;
    }

    public static class Job {
        public int A;
        public int B;
        public Job(int a, int b) {
            this.A = a;
            this.B = b;
        }
    }
}