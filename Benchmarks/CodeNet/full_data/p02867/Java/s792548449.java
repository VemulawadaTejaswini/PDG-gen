import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A[] = new int[N];
        int B[] = new int[N];
        int C[] = new int[N];
        for (int i=0; i<N; i++)
            A[i] = Integer.parseInt(sc.next());
        for (int i=0; i<N; i++)
            B[i] = Integer.parseInt(sc.next());
        sc.close();

        int cnt = N - 2;
        boolean s = false;
        while (cnt>0) {
            int h = iMAX(N, A, C);
            int k = iMAX(N, B, C);
            if (h==k) {
                C[k] = 1;
            } else {
                int l = B[h];
                B[h] = B[k];
                B[k] = l;
                cnt--;
            }
            if (OK(N, A, B)) {
                s = true;
                break;
            }
        }
        if (s) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean OK(int N, int A[], int B[]) {
        for (int i=0; i<N; i++) {
            if (A[i]>B[i])
                return false;
        }
        return true;
    }
    public static int iMAX(int N, int D[], int C[]) {
        int m = 0;
        int j = 0;
        for (int i=0; i<N; i++) {
            if (C[i]==0 && m<D[i]) {
                m = D[i];
                j = i;
            }
        }
        return j;
    }
}