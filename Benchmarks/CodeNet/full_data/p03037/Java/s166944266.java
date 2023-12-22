import java.util.*;

public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int l = 0;
        int r = INF;
        for(int tmp = 0; tmp< m; tmp++){
            int x = sc.nextInt();
            l = Math.max(x,l);
            int y = sc.nextInt();
            r = Math.min(y,r);
        }

        System.out.println(l <= r ? r - l + 1 : 0);
    }
}
