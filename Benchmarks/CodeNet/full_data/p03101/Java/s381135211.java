import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in[];
        int H, W, h, w;
        in = scanner.nextLine().split(" ");
        H = Integer.parseInt(in[0]);
        W = Integer.parseInt(in[1]);

        in = scanner.nextLine().split(" ");
        h = Integer.parseInt(in[0]);
        w = Integer.parseInt(in[1]);

        int ret = 0;
        for (int i = 0; i < H-h; i++) {
            for (int j = 0; j < W-w; j++) {
                ret++;
            }
        }
        System.out.println(ret);
    }
}