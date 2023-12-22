import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] tb = new int[10][10];
        for(int i = 1; i <= n; i++){
            String tmp = String.valueOf(i);
            int t = Character.getNumericValue(tmp.charAt(0));
            int b = Character.getNumericValue(tmp.charAt(tmp.length()-1));
            tb[t][b]++;
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            String tmp = String.valueOf(i);
            int t = Character.getNumericValue(tmp.charAt(0));
            int b = Character.getNumericValue(tmp.charAt(tmp.length()-1));
            ans += tb[b][t];
        }
        System.out.println(ans);
    }
}