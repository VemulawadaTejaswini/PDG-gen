import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        sc.close();
        int gt=0;
        if(x<=3)gt+=(4-x)*100000;
        if(y<=3)gt+=(4-y)*100000;
        if(x==1&&y==1)gt+=400000;
        System.out.println(gt);
    }
}