import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] a = new char[H][W];
        boolean[] ha = new boolean[H];
        boolean[] wa = new boolean[W];

        for(int i = 0; i<H; i++) {
            String str = sc.next();
            for(int j = 0; j<W; j++) {
                a[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i<W; i++) {
            for(int j = 0; j<H; j++) {
                if(a[j][i] == '#') break;
                if(j==H-1) wa[i] = true;
            }
        }
        for(int i = 0; i<H; i++) {
            for(int j = 0; j<W; j++) {
                if(a[i][j] == '#') break;
                if(j==W-1) ha[i] = true;
            }
        }

        for(int i = 0; i<H; i++) {
            for(int j = 0; j<W; j++) {
                if(ha[i] == true || wa[j] == true) continue;
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }
}