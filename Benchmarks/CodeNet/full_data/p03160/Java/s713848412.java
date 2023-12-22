import java.lang.*;
import java.math.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class frog1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            h[i]=sc.nextInt();
        }
        int a[]=new int[n];
        a[0]=0;
        a[1]=Math.abs(h[1]-h[0]);
        for(int i=2;i<n;i++)
        {
            a[i]=Math.min(a[i-2]+Math.abs(a[i-2]-a[i]),a[i-1]+Math.abs(a[i-1]-a[i]));
        }
        System.out.println(a[n-1]);
    }
}