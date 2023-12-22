import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        final int[][] p = new int[M][2];
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            p[i][0] = s;
            p[i][1] = c;
        }

        for (int i = 0; i < 1000; i++) {
            String str = String.valueOf(i);
            if (str.length() != N) continue;

            boolean ok = true;
            for (int j = 0; j < M; j++) {
                int k = Character.getNumericValue(str.charAt(p[j][0]-1));
                if (k != p[j][1]) ok = false;
            }

            if (ok) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
