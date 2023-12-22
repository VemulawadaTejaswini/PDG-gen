import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int max = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            if(max < h[i]) max = h[i];
            if(max <= h[i]) ans++;
        }
        System.out.println(ans);
    }
}