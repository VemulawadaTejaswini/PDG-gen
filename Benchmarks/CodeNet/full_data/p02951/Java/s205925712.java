import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        int gt=c-(a-b);
        if(gt<0)gt=0;
        System.out.println(gt);
    }
}