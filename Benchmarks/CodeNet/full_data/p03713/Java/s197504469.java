import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long full = H * W;
        long min = full;
        for (int i = 0; i <= H / 2; i++) {
            long[] areas = new long[3];
            areas[0] = i * W;
            areas[1] = ((H - i) / 2) * W;
            areas[2] = full - areas[0] - areas[1];
            Arrays.sort(areas);
            min = Math.min(min, areas[2] - areas[0]);

            areas[0] = i * W;
            areas[1] = (H - i) * (W / 2);
            areas[2] = full - areas[0] - areas[1];
            Arrays.sort(areas);
            min = Math.min(min, areas[2] - areas[0]);
        }
        long tmp = H;
        H = W;
        W = tmp;
        for (int i = 0; i <= H / 2; i++) {
            long[] areas = new long[3];
            areas[0] = i * W;
            areas[1] = ((H - i) / 2) * W;
            areas[2] = full - areas[0] - areas[1];
            Arrays.sort(areas);
            min = Math.min(min, areas[2] - areas[0]);

            areas[0] = i * W;
            areas[1] = (H - i) * (W / 2);
            areas[2] = full - areas[0] - areas[1];
            Arrays.sort(areas);
            min = Math.min(min, areas[2] - areas[0]);
        }

        System.out.println(min);
    }
}
