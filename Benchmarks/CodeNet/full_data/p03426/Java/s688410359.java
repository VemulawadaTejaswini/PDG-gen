import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        int[] px = new int[90001];
        int[] py = new int[90001];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int a = sc.nextInt();
                px[a] = i;
                py[a] = j;
            }
        }
        int[] c = new int[90001];

        for (int i = d + 1 ; i <= h * w ; i++) {
            c[i] = c[i - d] + Math.abs(px[i] - px[i - d]) + Math.abs(py[i] - py[i - d]);
        }

        int q = sc.nextInt();
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        for (int i = 0 ; i < q ; i++) {
            System.out.println(c[r[i]] - c[l[i]]);
        }

    }

}