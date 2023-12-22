import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        long h=sc.nextLong(),w=sc.nextLong();
        long total=0;
        if(w%2==0){
            total=w/2*h;
        }else{
            long f=w/2+1;
            long s=w/2;
            if(h%2==0){
                total=f*h/2+s*h/2;
            }else{
                total=f*((h+1)/2)+s*(h/2);
            }
        }
        System.out.println(total);
    }
}