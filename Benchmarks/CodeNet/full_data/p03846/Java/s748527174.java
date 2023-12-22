import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int[] ary=new int[50000];
        Arrays.fill(ary,0);
        int n=sc.nextInt();
        int j=0;;
        for(int i=0;i<n;i++){
            j=sc .nextInt();
            ary[j]++;
            if(ary[j]>=3||(j==0&&ary[0]>=2)){
                sc.close();
                System.out.println("0");
                System.exit(0);
            }
        }
        sc.close();
        System.out.println((long)Math.pow(2,n/2));
    }
}