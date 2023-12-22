import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        int max = 0;
        int min = -1;
        int maxcnt = 0;
        int mincnt = 0;
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
            if (max < p[i]) {
                max = p[i];
                maxcnt++;
            }
            if (min > p[i]) {
                min = p[i];
                mincnt++;
            }
        }
        if (maxcnt <= 2 || mincnt <= 2 ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
