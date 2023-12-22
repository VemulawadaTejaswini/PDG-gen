import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int lmax = 0, rmin = Integer.MAX_VALUE;
        int res;
        for(int i = 0; i < m; i++) {
            int l = Integer.parseInt(sc.next()), r = Integer.parseInt(sc.next());
            lmax = Math.max(lmax, l);
            rmin = Math.min(rmin, r);
        }
        res = Math.max(0, rmin - lmax + 1);
        System.out.println(res);
    }
}
