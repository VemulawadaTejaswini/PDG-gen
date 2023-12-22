import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] points = {0, W, 0, H};
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();

            int point = points[a - 1];
            switch (a) {
            case 1:
                point = Math.max(point, x);
                break;
            case 2:
                point = Math.min(point, x);
                break;
            case 3:
                point = Math.max(point, y);
                break;
            case 4:
                point = Math.min(point, y);
            }
            points[a - 1] = point;
        }

        int width = points[1] - points[0];
        int hight = points[3] - points[2];
        if (width <= 0 || hight <= 0) {
            System.out.println(0);
            return;
        }
        System.out.println(width * hight);
    }
}