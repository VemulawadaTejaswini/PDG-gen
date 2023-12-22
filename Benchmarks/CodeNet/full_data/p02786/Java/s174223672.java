import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long ans = 0;
        long cnt = 1;
        while(h >= 1){
            ans += cnt;
            h /= 2;
            cnt *= 2;
        }
        System.out.println(ans);
    }
}
 