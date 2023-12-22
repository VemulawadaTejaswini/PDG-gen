import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][][] g = new int[h][w][4];//L,U,R,D
        char[][] s = new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if(s[i][j] == '.'){
                    g[i][j][0] = 1;
                    g[i][j][1] = 1;
                    if(0 < j) g[i][j][0] += g[i][j-1][0];
                    if(0 < i) g[i][j][1] += g[i-1][j][1];
                }
            }
        }
        int ans = 0;
        for (int i = h-1; i >= 0; i--) {
            for (int j = w-1; j >= 0; j--) {
                if(s[i][j] == '.'){
                    g[i][j][2] = 1;
                    g[i][j][3] = 1;
                    if(j < w-1) g[i][j][2] += g[i][j+1][2];
                    if(i < h-1) g[i][j][3] += g[i+1][j][3];
                }
                ans = Math.max(ans, g[i][j][0] + g[i][j][1] + g[i][j][2] + g[i][j][3] - 3);
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
