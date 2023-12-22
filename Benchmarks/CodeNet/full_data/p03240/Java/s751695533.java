import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] datas = new int[n][3];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int h = sc.nextInt();
            datas[i] = new int[]{x, y, h};
        }
        
        int idx = 0;
        System.out.println(datas[idx][2]);
        while (datas[idx][2] < 1) {
            idx++;
        }
        int x0 = datas[idx][0];
        int y0 = datas[idx][1];
        int h0 = datas[idx][2];
        
        
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                boolean solved = true;
                int H = h0 + Math.abs(x0 - cx) + Math.abs(y0 - cy);
                
                for (int i = 0; i < n; i++) {
                    int x = datas[i][0];
                    int y = datas[i][1];
                    int h = datas[i][2];
                    
                    boolean contradicts = h != Math.max(H - Math.abs(x - cx) - Math.abs(y - cy), 0);
                    if (contradicts) {
                        solved = false;
                        break;
                    }
                }
                
                if (solved) {
                    System.out.println(cx + " " + cy + " " + H);
                    return;
                }
            }
        }
    }
}
