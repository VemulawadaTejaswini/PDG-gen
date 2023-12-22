import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();
        long ans = 0;
        if((a+b)%2 == 1){
            ans = Math.min(Math.max(a-1,b-1),Math.max(n-a,n-b));
        }else{
            ans = Math.abs((a-b)/2);
        }
        System.out.println(ans);
    }
}

