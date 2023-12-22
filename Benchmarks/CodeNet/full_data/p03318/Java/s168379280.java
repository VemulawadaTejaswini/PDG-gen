//import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long k = Long.parseLong(br.readLine());
        ArrayList<Long> ans = new ArrayList<Long>();
        for (int i = 0; i <= 15; i++) {
            for (int j = 1; j <= 9; j++) {
                String repeat = new String(new char[i]).replace("\0", String.valueOf(9));
                String snuke = j + repeat;
                ans.add(Long.parseLong(snuke));
            }
        }
        
        for (int i = 0; i < k; i++) {
            System.out.println(ans.get(i));
        }
        
    }
    /*
    public static void isSnuke(long l) {
        
    }
    
    public static long get_digit_sum(long l) {
        int digit_sum = 0;
        long temp = l;
        while (true) {
            digit_sum += temp % 10;
            temp /= 10;
            if (temp == 0) break;
        }
        return digit_sum;
    }*/
}
