import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        int w = tx - sx;
        int h = ty - sy;
        for (int i = 0; i < h; i++) {
            System.out.print('U');
        }
        for (int i = 0; i < w; i++) {
            System.out.print('R');
        }
        for (int i = 0; i < h; i++) {
            System.out.print('D');
        }
        for (int i = 0; i < w; i++) {
            System.out.print('L');
        }
        System.out.print('L');
        for (int i = 0; i < h + 1; i++) {
            System.out.print('U');
        }
        for (int i = 0; i < w + 1; i++) {
            System.out.print('R');
        }
        System.out.print('D');
        System.out.print('R');
        for (int i = 0; i < h + 1; i++) {
            System.out.print('D');
        }
        for (int i = 0; i < w + 1; i++) {
            System.out.print('L');
        }
        System.out.println('U');
    }
}
