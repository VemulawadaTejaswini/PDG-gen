import java.util.Scanner;

public class Main {
    public static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        M = Integer.parseInt(sc.next());
        int[] S = new int[M];
        int[] C = new int[M];
        for(int i = 0; i < M; i++) {
            S[i] = Integer.parseInt(sc.next());
            C[i] = Integer.parseInt(sc.next());
        }

        for(int i = 0; i < 1000; i++) {
            if(ok(Integer.toString(i), S, C)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
    static boolean ok(String str, int[] s, int[] c) {
    	if(str.length() != N) return false;
        for(int i = 0; i < M; i++) {
            if(str.charAt(s[i] - 1) != c[i] + '0') return false;
        }
        return true;
    }
}
