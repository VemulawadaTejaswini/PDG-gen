import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char x[][] = new char[H][W];
        for (int i = 0; i < H; i++) {
            String tmpword = sc.next();
            for (int j = 0; j < W; j++) {
                x[i][j] = tmpword.charAt(j);
            }
        }
        int a[] = { 0, 0, 1, 1, 1, -1, -1, -1 };
        int b[] = { 1, -1, 1, -1, 0, 1, -1, 0 };
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int tmp = 0;
                for (int k = 0; k < 8; k++) {
                    int i2 = i + a[k];
                    int j2 = j + b[k];
                    if (i2 >= 0 && i2 < H && j2 >= 0 && j2 < W) {
                        if (x[i2][j2] == '#') {
                            tmp++;
                        }
                    }
                }
                if (x[i][j] == ('.')) {
                    System.out.print(tmp);
                    // x[i][j] = (char)tmp;
                } else {
                    System.out.print("#");
                    // x[i][j] = '#';
                }
            }
            System.out.println("");
        }
    }

}