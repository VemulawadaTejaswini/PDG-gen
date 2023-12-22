import java.math.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class Main{


    public static long f(long n){
        if(n==1) return 1;
        return n*f(n-1);
    }

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int res = 1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)!=s.charAt(i-1)) res++;
        }

        System.out.print(res);



    }

    
}
