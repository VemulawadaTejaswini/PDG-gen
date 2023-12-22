import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int rx = x, ry = y;
        long ans = 0L;
        if(a+b > c*2){
            rx -= Math.min(x, y);
            ry -= Math.min(x, y);
            ans += c * Math.min(x, y) * 2;
        }
        if(0 < rx){
            if(a < c*2) ans += a * rx;
            else ans += c * 2 * rx;
        }
        if(0 < ry){
            if(b < c*2) ans += b * ry;
            else ans += c * 2 * ry;
        }

        System.out.println(ans);
        sc.close();

    }

}
