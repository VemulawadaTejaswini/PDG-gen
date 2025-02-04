import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int array[][] = new int[3][n + 1];
        for(int i = 1;i <= 2;i++){
            String str = br.readLine();
            for(int j = 1;j <= n;j++)
                array[i][j] = str.charAt(j - 1);
        }
        String str = "";
        for(int i = 1;i < n;i++){
            if(array[1][i] == array[1][i + 1]){
                str += 'Y';
                ++i;
                continue;
            }
            else str += 'X';
            if(i == n - 1)str += 'X';
        }
        long ans;
        long mod = (long)1E9 + 7;
        if(str.charAt(0) == 'X')
            ans = 3;
        else ans = 6;
        for(int i = 1;i < str.length();i++){
            if(str.charAt(i - 1) == 'X' && str.charAt(i) == 'Y')ans *= 2;
            if(str.charAt(i - 1) == 'X' && str.charAt(i) == 'X')ans *= 2;
            if(str.charAt(i - 1) == 'Y' && str.charAt(i) == 'Y')ans *= 3;
            while(ans >= mod)ans -= mod;
        }
        System.out.println(ans);
    }
}
