import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int sx = 0;
        int ex = w;
        int sy = 0;
        int ey = h;
        for (int i = 0;i < n;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            if (a==1) {
                sx = Math.max(sx,x);
            } else if (a==2) {
                ex = Math.min(ex,x);
            } else if (a==3) {
                sy = Math.max(sy,y);
            } else if (a==4) {
                ey = Math.min(ey,y);
            }
        }
        int ret = (ex-sx)*(ey-sy);
        if (ret<0) ret = 0;
        System.out.println(ret);
    }
}
