import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int x0 = 0, y0 = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int a1 = in.nextInt();
            switch (a1) {
                case 1:
                    x0 = Math.max(x0, x1);
                    break;
                case 2:
                    w = Math.min(w, x1);
                    break;
                case 3:
                    y0 = Math.max(y0, y1);
                    break;
                case 4:
                    h = Math.min(h, y1);
                    break;
            }
        }

        int square = (w - x0) * (h - y0);
        System.out.println(Math.max(square, 0));
    }
}
