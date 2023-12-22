import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int[] xl = {-1,-1,-1,0,0,1,1,1};
    static int[] yl = {-1,0,1,-1,1,-1,0,1};
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
        }
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(map[i][j] == '#') continue;
                int a = checkCount(map,i,j,h,w);
                map[i][j] = String.valueOf(a).charAt(0);
            }
        }
        for(int i = 0; i < h; i++){
            System.out.println(new String(map[i]));
        }
    }
    
    public static int checkCount(char[][] map, int y, int x, int h, int w){
        int ans = 0;
        for(int i = 0; i < 8; i++){
            if(check(y+yl[i], x+xl[i], h, w) && map[y+yl[i]][x+xl[i]] == '#'){
                ans++;
            }
        }
        return ans;
    }
    
    public static boolean check(int y, int x, int h, int w){
        return (0 <= y && y < h && 0 <= x && x < w);
    }
}