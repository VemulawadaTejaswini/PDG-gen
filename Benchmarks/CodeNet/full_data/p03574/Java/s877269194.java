import java.util.Scanner;

public class Main {

    private static int count1(String[] sh, int h, int w) {
        if (h < 0 || w < 0 || sh.length <= h || sh[0].length() <= w) {
            return 0;
        }
        String x = sh[h].substring(w, w+1);
        return x.equals("#") ? 1 : 0;
    }

    private static int count8(String[] sh, int h, int w) {
        String x = sh[h].substring(w, w+1);
        if (x.equals("#")) {
            return -1;
        }
        return count1(sh, h-1, w-1) + count1(sh, h-1, w) + count1(sh, h-1, w+1) +
               count1(sh, h  , w-1)                      + count1(sh, h  , w+1) +
               count1(sh, h+1, w-1) + count1(sh, h+1, w) + count1(sh, h+1, w+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] sh = new String[h];
        for (int i = 0; i < h; i++) {
            sh[i] = sc.next();
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int x = count8(sh, i, j);
                System.out.print(x == -1 ? "#" : x);
            }
            System.out.println();
        }
    }

}