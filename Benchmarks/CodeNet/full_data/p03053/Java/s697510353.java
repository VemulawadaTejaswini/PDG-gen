import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int [][] cr;
    static int H;
    static int W;
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        H = Integer.parseInt(s[0]);
        W = Integer.parseInt(s[1]);
        cr = new int[H][W];
        for(int i = 0 ; i < H ; i++) {
            String str = stdR.readLine();
            for(int j = 0 ; j < W ; j++) {
                if(str.charAt(j) == '#') {
                    cr[i][j] = 0;
                }else {
                    cr[i][j] = 10000;   
                }
            }
        }
        for(int i = 0 ; i < H ; i++) {
            for(int j = 0 ; j < W ; j++) {
                if(cr[i][j] == 0) {
                    counted(j, i, 0);
                }
            }
        }
        int max = 0;
        for(int i = 0 ; i < H ; i++) {
            for(int j = 0 ; j < W ; j++) {
                max = Math.max(max, cr[i][j]);
            }
        }
        System.out.println(max);
    }
    
    public static void counted(int nx, int ny, int nturn) {
        if(nx - 1 >= 0 && (nturn + 1) < cr[ny][nx - 1]) {
            cr[ny][nx - 1] = nturn + 1;
            counted(nx - 1, ny, nturn + 1);
        }
        if(ny - 1 >= 0 && (nturn + 1) < cr[ny - 1][nx]) {
            cr[ny - 1][nx] = nturn + 1;
            counted(nx, ny - 1, nturn + 1);
        }
        if(nx + 1 < W && (nturn + 1) < cr[ny][nx + 1]) {
            cr[ny][nx + 1] = nturn + 1;
            counted(nx + 1, ny, nturn + 1);
        }
        if(ny + 1 < H && (nturn + 1) < cr[ny + 1][nx]) {
            cr[ny + 1][nx] = nturn + 1;
            counted(nx, ny + 1, nturn + 1);
        }
    }
}
