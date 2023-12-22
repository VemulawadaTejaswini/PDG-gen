import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        n=n%k;
        long m=n-k;
        if(m<0)m=-m;
        n=(n>=m?m:n);
        System.out.println(n);
    }
}