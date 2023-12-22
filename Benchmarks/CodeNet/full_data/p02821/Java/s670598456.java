import java.util.*;

class Main {

    static void reverse(int[] a) {
        final int n = a.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        // A cumulative summation.
        int[] A2 = new int[N * N];
        int v = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A2[v] = A[i] + A[j];
                v += 1;
            }
        }

        Arrays.sort(A2);
        reverse(A2);
        int[] SA = new int[(N + 1) * (N + 1)];
        SA[0] = 0;
        for (int i = 0; i < N * N; i++) {
            SA[i + 1] = SA[i] + A2[i];
        }

        System.out.println(SA[M]);
    }
}
