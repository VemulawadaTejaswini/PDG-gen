import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++){
            int sum = sumDigit(String.valueOf(i).toCharArray());
            if(a <= sum && sum <= b){
                ans += i;
            }
        }
        System.out.println(ans);
    }
    
    public static int sumDigit(char[] c){
        int ret = 0;
        int len = c.length;
        for(int i = 0; i < len; i++){
            ret += Character.getNumericValue(c[i]);
        }
        return ret;
    }
}