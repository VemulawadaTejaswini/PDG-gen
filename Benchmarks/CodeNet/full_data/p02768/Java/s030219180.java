import java.io.*;
import java.util.*;

public class Main{
    static long all(long a){
        long gt=1;
        for(long i=0;i<a;i++){
            gt=gt*2%1000000007;
        }
        return gt;
    }

    static long cmb(long n,long r){
        if(n==r||r==0){
            return 1;
        }
        return (cmb(n-1,r-1)%1000000007+cmb(n-1,r)%1000000007)%1000000007;
    }

    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
        System.out.println((all(n)-cmb(n,a)-cmb(n,b)-1)%1000000007);
    }
}