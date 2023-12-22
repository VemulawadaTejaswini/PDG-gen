import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] ans = new char[n];
        for(int i = 0; i < n; i++){
            ans[i] = '0';
        }
        for(int i = 0; i < m; i++){
            int s = sc.nextInt();
            char c = sc.next().charAt(0);
            if(ans[s-1] != '0' && ans[s-1] != c){
                System.out.println(-1);
                return;
            }else{
                ans[s-1] = c;
            }
        }
        if(n != 1 && ans[0] == '0'){
            System.out.println(-1);
        }else{
            System.out.println(new String(ans));
        }
    }
}
