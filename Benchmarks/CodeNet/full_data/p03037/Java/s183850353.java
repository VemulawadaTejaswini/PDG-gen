import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int m = sc.nextInt();

        int l = 1;
        int r = n;

        boolean end = false;
        for (int i=0; i < m; i++) {
            if (!end) {
                int ln = sc.nextInt();
                int rn = sc.nextInt();

                if (overlap(l, r, ln, rn)) {
                    l = l >= ln ? l : ln;
                    r = rn >= r ? r : rn;
                } else {
                    l = 0;
                    r = -1;
                    end = true;
                }
            }
        }

        System.out.println(r - l + 1);

    }

    public static boolean overlap(int l1, int r1, int l2, int r2) {
        return r1 >= l2 && l1 <= r2;
    }
}
