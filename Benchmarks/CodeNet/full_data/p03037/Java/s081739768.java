import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        int[] Ni = new int[N];
        int cnt = 0;
        for (int i=0; i<M; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
            for (int j=L[i]-1; j<R[i]; j++) {
                Ni[j]++;
                if (Ni[j] == M) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
