import java.util.*;




public class Main {


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n+1];
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = cin.nextInt();
        }
        int ans = 0;
        for (int i = 1; i <= 111; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[j - 1] == 0 && a[j] > 0) {
                    ans++;
                }
            }
            for (int j = 1; j <= n; j++) {
                if (a[j]>0) {
                    a[j]--;
                }
            }
        }

        System.out.println(ans);
    }


}
