import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[11];
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            a[tmp]++;
        }
        int ans = 0;
        for (int i = 1; i < a.length - 2; i++) {
            int tmp = a[i] + a[i + 1] + a[i+ 2];
            if(tmp > ans) ans = tmp;
        }
        System.out.println(ans);
    }
}