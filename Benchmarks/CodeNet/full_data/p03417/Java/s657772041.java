import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long n = sc.nextLong();
        long m = sc.nextLong();

        long ans = (n-2)*(m-2);



        out.print(Math.abs(ans));
        out.flush();
    }
}