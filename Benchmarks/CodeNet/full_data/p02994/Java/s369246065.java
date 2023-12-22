import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] ll = new int[n];
        int min = Integer.MAX_VALUE;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            ll[i] = l + i - 1 + 1;
            int lll = Math.abs(ll[i]);
            if(min > lll) {
                min = lll;
                tmp = i;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(!(i == tmp)) {
                ans += ll[i];
            }
        }
        System.out.println(ans);
    }
}