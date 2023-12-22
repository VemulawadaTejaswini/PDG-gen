import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        for(int i=0;i<(int)Math.max(a,b);i++){
            System.out.print((int)Math.min(a,b));
        }
        System.out.println();
    }
}