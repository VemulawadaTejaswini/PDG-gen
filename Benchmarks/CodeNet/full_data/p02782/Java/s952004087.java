import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner sc;
    private static int r1;
    private static int r2;
    private static int c1;
    private static int c2;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        sc.close();

        solve();
    }

    private static void solve() {
        int[] map = new int[r2 + 1];
        Arrays.fill(map, 1);
        int ans = 0;
        
        for(int c = 1; c<=c2; c++) {
            for(int r = 1; r<=r2; r++) {
                map[r] = sumIikanzi(map[r] , map[r-1]);
                if(c >= c1 && r >= r1) {
                    ans = sumIikanzi(map[r], ans);
                }
            }
        }

        System.out.println(ans);
    }

    private static int sumIikanzi(int a, int b) {
        return (a + b) % 1000000007;
    }

}
