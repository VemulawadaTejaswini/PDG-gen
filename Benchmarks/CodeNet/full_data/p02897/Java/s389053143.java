import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        System.out.println((double)(n-n/2)/n);
    }
}