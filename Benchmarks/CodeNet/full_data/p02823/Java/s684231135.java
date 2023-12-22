import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        if((b-a)%2==0){
            System.out.println((b-a)/2);
        }else{
            System.out.println((int)Math.min(b-1,n-a));
        }
    }
}