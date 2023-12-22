import java.util.*;
 
public class Main {

    static int H; 
    static int W;
    static char[][] masu;
    static int count0;
    static int count1;
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        masu = new char[H][W];
        count0 = 0;
        count1 = 0;
        for (int i = 0; i < H; i++) {
            String str = sc.next();
            for (int j = 0; j < W; j++) {
                masu[i][j] = str.charAt(j);
            }
        }
        go0(0,0);
        //go1(0,0);
        //System.out.println(count0 + " "+count1);
        System.out.println(count0);
    }

    static void go0(int x, int y) {

        if (x == W-1 && y == H-1) {
            return;
        }
        if (x+1 < W && masu[y][x+1] == '#'
            && y+1 < H && masu[y+1][x] == '#') {    //  行けない
            //  ひっくり返す
            reverse0(x, y);
            count0++;
        }
        if (x+1 < W && masu[y][x+1] == '.') {
            go0(x+1, y);
            //go1(x+1, y);
        }
        if (y+1 < H && masu[y+1][x] == '.') {
            go0(x, y+1);
            //go1(x, y+1);
        }
    }

    static void go1(int x, int y) {

        if (x == W-1 && y == H-1) {
            return;
        }
        if (x+1 < W && masu[y][x+1] == '#'
            && y+1 < H && masu[y+1][x] == '#') {    //  行けない
            //  ひっくり返す
            reverse1(x, y);
            count1++;
        }
        if (x+1 < W && masu[y][x+1] == '.') {
            //go0(x+1, y);
            go1(x+1, y);
        }
        if (y+1 < H && masu[y+1][x] == '.') {
            //go0(x, y+1);
            go1(x, y+1);
        }
    }
    static void reverse0(int x, int y) {

        for (int i = y; i < H; i++) {
            for (int j = x+1; j < W; j++) {
                if (masu[i][j] == '#') {
                    masu[i][j] = '.';
                } else {
                    masu[i][j] = '#';
                }
            }
        }   
    }
    static void reverse1(int x, int y) {

        for (int i = y+1; i < H; i++) {
            for (int j = x; j < W; j++) {
                if (masu[i][j] == '#') {
                    masu[i][j] = '.';
                } else {
                    masu[i][j] = '#';
                }
            }
        }   
    }
} 