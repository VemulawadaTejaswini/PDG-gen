import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] x = new int[h * w + 1];
        int[] y = new int[h * w + 1];

        int d = sc.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int in = sc.nextInt();
                x[in] = i + 1;
                y[in] = j + 1;
            }
        }

        int q = sc.nextInt();
        int ansQ = 0;
        for (int i = 0; i < q; i++) {
            int xIn = sc.nextInt();
            int r = sc.nextInt();
            boolean plus = xIn < r;
            while (xIn != r) {
                int next = plus ? (xIn + d) : (xIn - d);
                ansQ += Math.abs(x[xIn] - x[next]) + Math.abs(y[xIn] - y[next]);
                xIn = next;
            }
            System.out.println(ansQ);
            ansQ = 0;
        }
    }
}