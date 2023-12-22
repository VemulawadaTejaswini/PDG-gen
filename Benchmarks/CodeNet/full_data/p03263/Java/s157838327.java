import java.util.*;

public class Main {
    static long INF = 1000000000000000L;
    
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] array = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        
        
        int r = 0;
        int c = 0;
        int flag = 0;
        if (array[r][c] % 2 != 0) {
            flag = 1;
        }
        
        int count = 0;
        List<String> ans = new ArrayList<String>();
        while (true) {
            int or = r;
            int oc = c;
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
            if (r ==h) break;
            if (flag == 0) {
                if (array[r][c] % 2 != 0) {
                    flag = 1;
                }
            } else {
                ans.add((or+1) + " " + (oc+1) + " ");
                ans.add((r+1) + " " + (c+1));
                count++;
                if (array[r][c] % 2 != 0) {
                    flag = 0;
                }
            }
        }
        
        System.out.println(count);
        for (int i = 0; i < ans.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(ans.get(i));
            } else {
                System.out.println(ans.get(i));
            }
        }
    }
}