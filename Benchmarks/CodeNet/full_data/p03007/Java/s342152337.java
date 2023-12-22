import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        StringBuilder op = new StringBuilder();
        int max = A[N-1];
        int min = A[0];
        for (int i = 1; i < N-1; i++) {
            if (A[i] < 0) {
                op.append(max+" "+A[i]+"\n");
                max -= A[i];
            } else {
                min -= A[i];
                op.append(min+" "+A[i]+"\n");
            }
        }
        op.append(max+" "+min+"\n");

        System.out.println(max-min);
        System.out.print(op.toString());
    }
}
