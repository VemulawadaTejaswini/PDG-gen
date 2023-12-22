import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        String[] st = new String[h];
        for (int i=0; i<h; i++) st[i] = sc.next();
        char[][] ch = new char[h][w];
        for (int i=0; i<h; i++) ch[i] = st[i].toCharArray();

        int cnt = 0;

        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                if (ch[i][j]=='1') cnt++;
            }
        }

        int ans = 0;

        if (cnt<=k) {
            out.print(0);
            out.flush();
            return;
        }

        while (cnt>=k) {
            cnt /= 2;
            ans++;
        }

        out.print(ans);
        out.flush();
    }

}
