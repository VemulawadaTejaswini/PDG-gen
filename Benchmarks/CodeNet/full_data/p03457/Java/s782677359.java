import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 現在位置から(x, y)離れた(ただしx, y >=0)座標にちょうどt秒で着く <=> t = x + y + 2k (k = 0, 1,...)
        // <=> (t - (x + y)) % 2 = 0 && t >= x + y
        int currX = 0;
        int currY = 0;
        int currT = 0;
        
        for (int i = 0; i < n; i++) {
            int nextT = sc.nextInt();
            int nextX = sc.nextInt();
            int nextY = sc.nextInt();
            int spanT = nextT - currT;
            int spanX = Math.abs(nextX - currX);
            int spanY = Math.abs(nextY - currY);
//            U.println("sT: " + spanT + ", sX: " + spanX + ", sY: " + spanY);
            if ((spanT - spanX - spanY) % 2 != 0 || spanT < spanX + spanY) {
                System.out.println("No");
                return;
            }
            currT = nextT;
            currX = nextX;
            currY = nextY;
        }
        System.out.println("Yes");
    }
}