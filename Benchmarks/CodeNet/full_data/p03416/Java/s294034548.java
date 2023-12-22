import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int cnt = 0;

        String a = sc.next();
        String b = sc.next();

        int tmpA = Integer.parseInt(a);
        int tmpB = Integer.parseInt(b);

        for (int i=tmpA; i<=tmpB; i++) {
            String str = String.valueOf(i);
            StringBuffer sb = new StringBuffer(str);
            String afterS = sb.reverse().toString();
            if (str.equals(afterS)) cnt++;
        }

        out.print(cnt);
        out.flush();
    }
}