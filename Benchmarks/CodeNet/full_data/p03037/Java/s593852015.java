import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int m = sc.nextInt();

        int l = 1;
        int r = n;

        for (int i=0; i < m; i++) {
            int ln = sc.nextInt();
            int rn = sc.nextInt();

            if (l < ln && !(r < ln))
                l = ln;
            if (rn < r && !(rn < l))
                r = rn;
        }

        System.out.println(r - l + 1);

    }
}
