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
                if (hA[i] != h - Math.abs(xA[i] - x) - Math.abs(yA[i] - y))
                    continue;
                while (true) {
                    i++;
                    if (i >= n) {
                        System.out.println(x + " " + y + " " + h);
                        System.exit(0);
                    }

                    int flag = hA[i] + Math.abs(xA[i] - x) + Math.abs(yA[i] - y);
                    if (h != flag)
                        break;
                }
            }
        }
    }
}
