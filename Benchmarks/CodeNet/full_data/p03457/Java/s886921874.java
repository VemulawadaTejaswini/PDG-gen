import java.lang.reflect.Array;
import java.util.*;

public class Main {
    class G {
        int x, y , t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n + 1][3];
        for(int i = 1; i <= n; ++i) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            a[i][2] = sc.nextInt();
        }
        a[0][0] = 0;
        a[0][1] = 0;
        a[0][2] = 0;
        boolean ok = true;
        for(int i = 1; i <= n; ++i) {
            int dt = a[i][0] - a[i - 1][0];
            int dx = Math.abs (a[i][1] - a[i - 1][1]);
            int dy = Math.abs (a[i][2] - a[i - 1][2]);
            if(dx + dy > dt || (dt - dx - dy) % 2 != 0) {
                ok = false;
                System.out.println("No");
                break;
            }
        }
        if(ok)
            System.out.println("Yes");
    }
}
