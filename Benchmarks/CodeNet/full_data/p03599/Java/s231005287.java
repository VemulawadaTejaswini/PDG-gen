import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();

        boolean water[] = new boolean[3001];
        Arrays.fill(water, false);
        water[0] = true;
        int wi = 0;
        while (wi <= 3000) {
            if (water[wi] == false) {
                wi++;
                continue;
            }

            if (wi + 100 * a <= 3000) {
                water[wi + 100 * a] = true;
            }
            if (wi + 100 * b <= 3000) {
                water[wi + 100 * b] = true;
            }

            wi++;
        }

        boolean sugur[] = new boolean[3001];
        Arrays.fill(sugur, false);
        sugur[0] = true;
        int si = 0;
        while (si <= 3000) {
            if (sugur[si] == false) {
                si++;
                continue;
            }

            if (si + c <= 3000) {
                sugur[si + c] = true;
            }
            if (si + d <= 3000) {
                sugur[si + d] = true;
            }
            
            si++;
        }

        double max = -1;
        int maxw = 0;
        int maxs = 0;
        for (int i = 0; i <= 3000; i++) {
            for (int j = 0; j <= 3000; j++) {
                if (water[i] && sugur[j]) {
                    double concentration = (double)j / ((double)i + j);
                    if (concentration > max && i / 100 * e >= j && i + j <= f) {
                        max = concentration;
                        maxw = i;
                        maxs = j;
                    }
                }
            }
        }
        System.out.println((maxw + maxs) + " " + maxs);
    }
}