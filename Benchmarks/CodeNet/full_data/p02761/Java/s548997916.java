import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] result = new int[N];
        for(int i = 0; i < N; i++) result[i] = 100;
        int[] S = new int[M];
        int[] C = new int[M];
        for(int i = 0; i < M; i++) {
            S[i] = Integer.parseInt(sc.next());
            C[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < M; i++) {
            result[S[i] - 1] = Math.min(C[i], result[S[i] - 1]);
        }
        if(result[N - 1] == 0 || result[N - 1] == 100) {
            System.out.println(-1);
            return;
        }
        String numStr = "";
        for(int i = 0; i < N; i++) {
            if(result[i] == 100) result[i] = 0;
            numStr += Integer.toString(result[i]);
        }
        System.out.println(numStr);
    }
}
