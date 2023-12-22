import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        sc.close();

        boolean f = false;
        for (int i=1; i<10; i++) {
            if (N % i==0) {
                if (N / i < 10) {
                    f = true;
                    break;
                }
            }
        }

        if (f) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}