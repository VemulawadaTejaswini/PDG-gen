import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }

        int cnt = 0;
        while (true) {
            int nax = 0;
            for (int i = 0; i < n; i++) {
                nax = Math.max(nax, as[i]);
            }
            // System.err.println(nax);
            if (nax == 0) break;
            int stat = 0;
            for (int i = 0; i < n; i++) {
                if (stat <= 1 && as[i] == nax) {
                    as[i]--;
                    stat =  1;
                } else if (stat == 1 && as[i] != nax) {
                    break;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}