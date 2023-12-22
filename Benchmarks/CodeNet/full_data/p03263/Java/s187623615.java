import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] array = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                array[i][j] = (sc.nextInt() % 2);
            }
        }
        
        int[][] ans = new int[h * w * 2][2];
        for (int i = 0; i < h * w * 2; i++) {
            Arrays.fill(ans[i], -1);
        }
        
        int r = 0;
        int c = 0;
        int count = 0;
        int flag = 0;
        while (true) {
            if (r >= h) break;
            
            if (array[r][c] == 1) {
                if (flag == 0) {
                    flag = 1;
                } else {
                    flag = 0;
                }
                ans[count][0] = r+1;
                ans[count][1] = c+1;
                count++;
            } else {
                if (flag == 1) {
                    ans[count][0] = r+1;
                    ans[count][1] = c+1;
                    count++;
                    ans[count][0] = r+1;
                    ans[count][1] = c+1;
                    count++;
                }
            }
            
            if (r % 2 == 0) {
                c++;
                if (c == w) {
                    c = w - 1;
                    r++;
                }
            } else {
                c--;
                if (c == -1) {
                    c = 0;
                    r++;
                }
            }
        }
        
        System.out.println(count / 2);
        for (int i = 0; i < h * w * 2; i += 2) {
            if (ans[i+1][0] == -1) break;
            
            System.out.println(ans[i][0] + " " + ans[i][1] + " " + ans[i+1][0] + " " + ans[i+1][1]);
        }
    }
}
