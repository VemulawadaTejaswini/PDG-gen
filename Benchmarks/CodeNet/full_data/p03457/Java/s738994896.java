import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            p[i][0] = sc.nextInt();
            p[i][1] = sc.nextInt();
            p[i][2] = sc.nextInt();
        }

        int cp[] = {0, 0, 0};
        for (int i = 0; i < n; i++) {
            int t = p[i][0];
            int x = p[i][1];
            int y = p[i][2];

            int dt = t - cp[0];
            int dx = x - cp[1];
            int dy = y - cp[2];

            if (dt < dx + dy) {
                System.out.println("No");
                return;
            }

            if (!(dt % (dx + dy) == 0)){
                System.out.println("No");
                return;
            }

            cp[0] = t;
            cp[1] = x;
            cp[2] = y;
        }
        System.out.println("Yes");
    }
}
