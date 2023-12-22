import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int x = sc.nextInt();
        int t = sc.nextInt();

        System.out.println(Math.max(0, x-t));
    }
}