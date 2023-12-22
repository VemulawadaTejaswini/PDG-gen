import java.util.*;

class Main {

    private void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }

        int[] dpa = new int[N];
        int[] dpb = new int[N];
        int[] dpc = new int[N];
        dpa[N-1] = A[N-1];
        dpb[N-1] = B[N-1];
        dpc[N-1] = C[N-1];

        for (int i = N-2; i >= 0; i--) {
            dpa[i] = Math.max(dpb[i+1], dpc[i+1]) + A[i];
            dpb[i] = Math.max(dpa[i+1], dpc[i+1]) + B[i];
            dpc[i] = Math.max(dpa[i+1], dpb[i+1]) + C[i];
        }

        int a = dpa[0];
        int b = dpb[0];
        int c = dpc[0];

        int max = a > b 
                  ? a > c 
                    ? a 
                    : c
                  : b > c
                    ? b
                    : c;
        System.out.println(max);
    }

    public static void main(String[] args) {
        Main solver = new Main();
        solver.run();
    }
}
