import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] a=new boolean[1000000000];
        Arrays.fill(a,false);
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            if(a[b]){
                System.out.println("NO");
                System.exit(0);
            }else{
                a[b]=true;
            }
        }
        System.out.println("YES");
    }
}