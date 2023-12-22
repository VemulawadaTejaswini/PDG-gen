import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int t;
        int x;
        int y;
        int nt = 0;
        int nx = 0;
        int ny = 0;
        boolean successFlg = false;
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < N; i++) {

            t = Integer.parseInt(sc.next());
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());

            if ((x - nx) <= (t - nt)) {
                for (int j = 1; j <= (t - nt) - (x - nx); j++) {
                    if (j + (-1 * ((t - nt) - (x - nx) - j)) == (y - ny)) {
                        successFlg = true;
                        break;
                    }
                }
                nt = t;
                nx = x;
                ny = y;
            } else {
                break;
            }
        }

        if (successFlg) {
            out.println("Yes");
        } else {
            out.println("No");
        }

        sc.close();
        out.flush();
    }
}