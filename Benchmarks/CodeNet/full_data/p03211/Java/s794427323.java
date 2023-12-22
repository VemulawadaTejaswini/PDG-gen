import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = Integer.MAX_VALUE;
        int n = s.length()-2;
        for(int i = 0; i < n; i++){
            int si = Integer.parseInt(s.substring(i,i+3));
            ans = Math.min(ans,Math.abs(753-si));
        }
        System.out.println(ans);
    }
}
 