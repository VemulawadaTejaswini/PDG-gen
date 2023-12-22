import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt(), M = sc.nextInt(), res = 0;
        int[] f = new int[N + 1];
        for(int i = 1; i <= M; i ++){
            int v = sc.nextInt(), u = sc.nextInt();
            f[u] = Math.max(f[u],f[v] + 1);
            res = Math.max(res,f[u]);
        }
        System.out.println(res);
    }
}