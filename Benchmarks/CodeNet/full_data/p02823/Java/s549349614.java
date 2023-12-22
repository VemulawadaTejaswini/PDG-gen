import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
        if((b-a)%2==0){
            System.out.println((b-a)/2);
        }else{
            System.out.println((long)Math.min(b-1,n-a));
        }
    }
}