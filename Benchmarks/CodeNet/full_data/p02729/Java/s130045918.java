import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int n  = sc.nextInt();
        int m  = sc.nextInt();

        int ans = n*(n-1)/2 + m*(m-1)/2;

        out.print(ans);
        out.flush();
    }

}
