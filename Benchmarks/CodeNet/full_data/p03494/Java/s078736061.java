import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        long[] aryNum = new long[n];
        for (int i = 0; i < n; i ++) {
            aryNum[i] = sc.nextInt();
        }

        int cnt = -1;
        boolean flg = true;
        
        while (flg) {
            cnt++;
            for (int i = 0; i < n; i++) {
                if (aryNum[i] % 2 == 0) {
                    aryNum[i] = aryNum[i] / 2;
                } else {
                    flg = false;
                    break;
                }
            }
         }
        
        System.out.println(cnt);
    }
}
