import java.util.Scanner;

public class Main {
    Main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n >= 2)
            n -= 2;

        if (m >= 2)
            m -= 2;

        System.out.println(n * m);
    }

    public static void main (String[] args) {
        new Main();
    }

}
