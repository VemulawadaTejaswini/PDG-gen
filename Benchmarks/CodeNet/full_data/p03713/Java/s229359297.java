import java.util.*;

public class Main {

    static long DIFF = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            return;
        }
        checkDevide1(h, w);
        checkDevide1(w, h);
        checkDevide2(h, w);
        checkDevide2(w, h);
        System.out.println(DIFF);
    }

    static void checkDevide1(int height, int width) {
        for(int h = 1; h < height-1; h++) {
            long restHeight = height - h;
            long h1 = restHeight / 2;
            long h2 = restHeight - h1;
            long one = (long)h * width;
            long two = h1 * width;
            long three = h2 * width;
            long max = Math.max(Math.max(one, two), three);
            long min = Math.min(Math.min(one, two), three);
            DIFF = Math.min(DIFF, (max - min));
        }
    }

    static void checkDevide2(int height, int width) {
        for(int h = 1; h < height; h++) {
            long restHeight = height - h;
            long w1 = width / 2;
            long w2 = width - w1;
            long one = (long)h * width;
            long two = restHeight * w1;
            long three = restHeight * w2;
            long max = Math.max(Math.max(one, two), three);
            long min = Math.min(Math.min(one, two), three);
            DIFF = Math.min(DIFF, (max - min));
        }
    }
}