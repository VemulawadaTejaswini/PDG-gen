import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str3 = str + str + str;
        str += str;
        char[] c = str.toCharArray();
        int k = sc.nextInt();
        
        char now = c[0];
        long count = 0;
        int tmp = 1;
        for (int i = 1; i < str.length(); i++) {
            if (c[i] != now) {
                count += tmp/2;
                tmp = 1;
                now = c[i];
            } else {
                tmp++;
            }
        }
        count += tmp/2;
        
        
        char[] c3 = str3.toCharArray();
        
        char now3 = c3[0];
        long count3 = 0;
        int tmp3 = 1;
        for (int i = 1; i < str3.length(); i++) {
            if (c3[i] != now3) {
                count3 += tmp3/2;
                tmp3 = 1;
                now3 = c3[i];
            } else {
                tmp3++;
            }
        }
        count3 += tmp3/2;
        
        
        
        System.out.println((count3 - count) *k);
        
    }
}