import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        long start = System.nanoTime();
        System.out.println(solve(n,h));
        long end = System.nanoTime();
        System.err.println("execution time: " + ((end-start)/1_000_000) + "ms");
    }
    private static int solve(int n, int[] h) {
        int u = 0;
        int v = Math.abs(h[1]-h[0]);
        for (int i = 2; i < n; i++) {
            int tmp = v;
            v = Math.min(v+Math.abs(h[i]-h[i-1]),u+Math.abs(h[i]-h[i-2]));
            u = tmp;
        }
        return v;
    }
}
