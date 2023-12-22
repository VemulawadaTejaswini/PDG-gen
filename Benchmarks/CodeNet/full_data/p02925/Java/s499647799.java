import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A[][] = new int[N][N-1];
        int C[] = new int[N];
        boolean b[] = new boolean[N];
        for (int i=0; i<N; i++) {
            for (int j=0; j<N-1; j++) {
                A[i][j] = Integer.parseInt(sc.next())-1;
            }
            C[i] = 0;
            b[i] = true;
        }
        sc.close();

        int day = 0;
        int cnt = 1;
        boolean all;
        do {
            all = true;
            for (int i=0; i<N; i++) {
                if (!b[i] && C[i]<N-1) {
                    b[i] = true;
                    cnt++;
                }
            }
            if (cnt==0)
                break;
            for (int i=0; i<N-1; i++) {
                if (!b[i])
                    continue;
                for (int j=i+1; j<N; j++) {
                    if (b[j] && j==A[i][C[i]] && i==A[j][C[j]]) {
                        b[i] = false;
                        b[j] = false;
                        C[i]++;
                        C[j]++;
                        all = false;
                        break;
                    }
                }
            }
            if (all) {
                break;
            } else {
                day++;
                cnt = 0;
            }
        } while(!all);
        if (cnt>0 && all) {
            System.out.println("-1");
        } else {
            System.out.println(day);
        }
    }
}
