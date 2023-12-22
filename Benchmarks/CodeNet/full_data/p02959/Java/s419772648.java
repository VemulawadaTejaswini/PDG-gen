import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        int[] b=new int[n];
        for(int i=0;i<=n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++)b[i]=sc.nextInt();

        long count=0;

        for(int i=n-1;i>=0;i--){
            if(a[i+1]>=b[i]){
               count=count+b[i];
            }
            else{
                count=count+a[i+1];
                b[i]=b[i]-a[i+1];

                count=count+Math.min(b[i],a[i]);
            }
        }
        System.out.println(count);

    }

}

