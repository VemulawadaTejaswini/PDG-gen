import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int tmp = 0;
            int a = sc.nextInt();
            while(a % 2 == 0){
                tmp++;
                a /= 2;
            }
            ans = Math.min(ans,tmp);
        }
        System.out.println(ans);
    }
}
 