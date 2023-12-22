import java.util.Scanner;

/**
 *
 * @author Ivan Eka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int count = 0;
        int c = 0, t;
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] Route = new int[N][2];
        for (int c1 = 0; c1 < N; c1++) {
            Route[c1][0] = sc.nextInt();
            Route[c1][1] = sc.nextInt();
            if (Route[c1][1] == T) {
                c = Route[c1][0];
            } else if (Route[c1][1] > T) {
                count++;
            }
        }
        if (count == N) {
            System.out.println("TLE");
        } else if (c != 0) {
            System.out.println(c);
        } else {
            t = T;
            for (int c2 = 0; c2 < N; c2++) {
                if (t > Route[c2][1]) {
                    c = Route[c2][0];
                    t = Route[c2][1];
                } else {
                    count++;
                }
            }
            System.out.println(c);
        }
    }
}