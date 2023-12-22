import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
        }
        int nt = 0, nx = 0, ny = 0;
        boolean bool = true;
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(map[i][j] == '.') continue;
                if(!check(map,i,j,h,w)){
                    bool = false;
                    break;
                }
            }
            if(!bool) break;
        }
        System.out.println(bool ? "Yes" : "No");
    }
    
    private static boolean check(char[][] map, int i, int j, int h, int w){
        int[] xl = {-1,0,0,1};
        int[] yl = {0,-1,1,0};
        for(int k = 0; k < 4; k++){
            if(i + yl[k] < 0 || i + yl[k] >= h || j + xl[k] < 0 || j + xl[k] >= w) continue;
            if(map[i + yl[k]][j + xl[k]] == '#') return true;
        }
        return false;
    }
}
