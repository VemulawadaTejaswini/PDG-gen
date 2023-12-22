import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        char[][] map = new char[H][W];
        
        for(int i = 0; i < H; i++) {
            String s = scan.next();
            map[i] = s.toCharArray();
        }
        
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                // System.out.print(map[i][j]);
                if(map[i][j] == '#') System.out.print('#');
                else System.out.print(countMine(i, j, H, W, map));
            }
            System.out.println();
        }
    }
    
    static int countMine(int i, int j, int H, int W, char[][] map) {
        int count = 0;
        if(i != 0 && j != 0 && map[i-1][j-1] == '#') count++; //左上
        if(i != 0 && map[i-1][j] == '#') count++; //上
        if(i != 0 && j != W-1 && map[i-1][j+1] == '#') count++; //右上
        if(j != 0 && map[i][j-1] == '#') count++; //左
        if(j != W-1 && map[i][j+1] == '#') count++; //右
        if(i != H-1 && j != 0 && map[i+1][j-1] == '#') count++; //左下
        if(i != H-1 && map[i+1][j] == '#') count++; //下
        if(i != H-1 && j != W-1 && map[i+1][j+1] == '#') count++; //右下
        
        return count;
    }
}
