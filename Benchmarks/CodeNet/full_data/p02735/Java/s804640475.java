import java.util.*;
 
public class Main {
 
    static int H; 
    static int W;
    static char[][] masu;
    static int count0;
    static int count1;
    static boolean white;
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        masu = new char[H][W];
        count0 = 0;
        //count1 = Integer.MAX_VALUE;
        white = true;
        for (int i = 0; i < H; i++) {
            String str = sc.next();
            for (int j = 0; j < W; j++) {
                masu[i][j] = str.charAt(j);
            }
        }
        if (masu[0][0] == '#') {
            count1 = 1;
            count0 = 1;
            white = false;
        }
        go(0,0);
        System.out.println(count1);
    }
    static void go(int x, int y) {
 
        if (x == W-1 && y == H-1) {
            count1 = Math.max(count1, count0);
            count0 = 0;
            return;
        }
        if (count1 != 1 && count0 > count1) {
            return;
        }
        if (white && x+1 < W && masu[y][x+1] == '#'
            && y+1 < H && masu[y+1][x] == '#') {    //  行けない
            count0++;
            white = false;
        } else if (white && x+1 < W && masu[y][x+1] == '#' && y == H-1) {
            count0++;
            white = false;
        } else if (white && x == W-1 && y+1 < H && masu[y+1][x] == '#') {
            count0++;
            white = false;
        } else if (!white && x+1 < W && masu[y][x+1] == '.'
            && y+1 < H && masu[y+1][x] == '.') {   //  行けない
            white = true;
        } else if (!white && x+1 < W && masu[y][x+1] == '.' && y == H-1) {
            white = true;
        } else if (!white && x == W-1 && y+1 < H && masu[y+1][x] == '.') {
            white = true;
        }
        if (white && x+1 < W && masu[y][x+1] == '.') {
            go(x+1, y);
        }
        if (white && y+1 < H && masu[y+1][x] == '.') {
            go(x, y+1);
        }
        if (!white && x+1 < W && masu[y][x+1] == '#') {
            go(x+1, y);
        }
        if (!white && y+1 < H && masu[y+1][x] == '#') {
            go(x, y+1);
        }
    }
}
    