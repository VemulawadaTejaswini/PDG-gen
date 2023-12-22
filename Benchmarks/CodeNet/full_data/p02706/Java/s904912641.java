import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i=0; i<m; i++) {
            int tmp = sc.nextInt();
            n -= tmp;
        }

        if (n >= 0) {
            System.out.println(n);
        } else {
            System.out.println(-1);
        }

    }
}
