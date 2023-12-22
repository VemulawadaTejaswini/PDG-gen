import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        final int INF = (int)Math.pow(10, 9) + 7;
        int dif = INF;
        for (int i = 0; i < h.length - K + 1; i++) {
            dif = Math.min(dif, h[K - 1 + i] - h[i]);
        }
        System.out.println(dif);
        sc.close();
    }
}