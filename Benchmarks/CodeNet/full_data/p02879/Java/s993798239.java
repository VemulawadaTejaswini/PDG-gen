import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        sc.close();

        if (A>9 || B>9) {
            System.out.println("-1");
        } else {
            System.out.println(A*B);
        }
    }
}