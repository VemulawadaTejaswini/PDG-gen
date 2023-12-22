import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] xA = new int[n];
        int[] yA = new int[n];
        int[] hA = new int[n];

        for (int i = 0; i < n; i++) {
            xA[i] = sc.nextInt();
            yA[i] = sc.nextInt();
            hA[i] = sc.nextInt();
        }

        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                int i = 0;
                int h = hA[i] + Math.abs(xA[i] - x) + Math.abs(yA[i] - y);
                do {
                    i++;
                    if (i >= n) {
                        if (h < 0)
                            h = 0;
                        System.out.println(x + " " + y + " " + h);
                        System.exit(0);
                    }
                } while (h == hA[i] + Math.abs(xA[i] - x) + Math.abs(yA[i] - y));
            }
        }
    }
}
