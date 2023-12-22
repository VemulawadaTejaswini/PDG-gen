import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextInt();
        long d=sc.nextInt();
        long x=b-a+1 - ((b/c) - (a/c) + (b/d) - (a/d) - ((b/(lcm(c,d))) - (a/(lcm(c,d)))));
//        System.out.println(x);
        if (a%c==0)x--;
        if (a%d==0)x--;
        if (a%(lcm(c,d))==0)x++;
        System.out.println(x);

    }
    static long gcd(long a,long b){
        if(a==0)return b;
        else return gcd(b%a,a);
    }
    static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }

}

