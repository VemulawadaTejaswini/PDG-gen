import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[][] ary = new int[n][2];
        int[] wary = {0, w};
        int[] hary = {0, h};
        for (int i = 0; i < n; i++) {
            ary[i][0] = Integer.parseInt(sc.next());
            ary[i][1] = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());
            switch (a) {
                case 1:
                    if (ary[i][0] > wary[0]) {
                        wary[0] = ary[i][0];
                    }
                    break;
                case 2:
                    if (ary[i][0] < wary[1]) {
                        wary[1] = ary[i][0];
                    }
                    break;
                case 3:
                    if (ary[i][1] > hary[0]) {
                        hary[0] = ary[i][1];
                    }
                    break;
                case 4:
                    if (ary[i][1] < hary[1]) {
                        hary[1] = ary[i][1];
                    }
                    break;
            }
        }
        int x = wary[1] < wary[0] ? 0 : wary[1] - wary[0];
        int y = hary[1] < hary[0] ? 0 : hary[1] - hary[0];
        System.out.println(x * y);
    }
}