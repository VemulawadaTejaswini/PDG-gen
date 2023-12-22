import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int[][] map = new int[h][w];
        
        //上の行
        String S = sc.next();
        String[] s = S.split("");
        for(int j=0; j<w; j++) {
            if(j == 0) {
                if(s[j].equals("#")) {
                    map[0][j] = 1;
                }else {
                    map[0][j] = 0;
                }
            }else {
                if(s[j].equals("#")) {
                    map[0][j] = map[0][j-1] + 1;
                }else {
                    map[0][j] = map[0][j-1];
                }
            }
        }
        
        for(int i=1; i<h; i++) {
            S = sc.next();
            s = S.split("");
            for(int j=0; j<w; j++) {
                if(j == 0) {
                    if(s[j].equals("#")) {
                        map[i][j] = map[i-1][j]+1;
                    }else {
                        map[i][j] = map[i-1][j];
                    }
                }else {
                    if(s[j].equals("#")) {
                        map[i][j] = Math.min(map[i-1][j], map[i][j-1]) + 1;
                    }else {
                        map[i][j] = Math.min(map[i-1][j], map[i][j-1]);
                    }
                }
            }
        }
        System.out.println(map[h-1][w-1]);
        
    }
}