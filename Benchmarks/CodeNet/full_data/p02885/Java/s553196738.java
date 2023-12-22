import java.math.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class Main {


    public static long f(long n){
        if(n==1) return 1;
        return n*f(n-1);
    }

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.print(Math.max(a-2*b,0));




    }

    
}
