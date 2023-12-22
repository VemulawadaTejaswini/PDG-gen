import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
       int n=sc.nextInt();
       int m=sc.nextInt();
       int a[]=new int[n];
       double all=0;
       for(int i=0;i<n;i++) {
           a[i] = sc.nextInt();
           all += a[i];
       }
       Arrays.sort(a);
       all/=m*4.0;
        //System.out.println(all+" "+m);
        if(a[n-m-1]>=all)
            System.out.println("Yes");
        else System.out.println("No");
    }
}
