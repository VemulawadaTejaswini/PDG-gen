import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        String[] arr = new String[3];
        for (int i=0; i<3; i++) arr[i] = sc.next();

        out.print(arr[0].charAt(0));
        out.print(arr[1].charAt(1));
        out.print(arr[2].charAt(2));
        out.flush();
    }
}