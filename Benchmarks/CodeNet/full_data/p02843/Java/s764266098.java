import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int X = Integer.parseInt(sc.next());
        final int N = 6;
        int[] price = new int[N];
        for (int i = 0; i < N; i++) {
            price[i] = 100 + i;
        }
        String ans = "0";
        
        for (int bit = 0; bit < (1 << N); bit++) {  // 2^6 -1  =  11 1111
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if ((1 & bit >> i) == 1) {          // 右にi桁ビットシフトさせたbitの1桁目が1だったらtrue
                    sum += price[i];
                }
            }
            if (sum != 0 && X % sum == 0) {
                ans = "1";
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}