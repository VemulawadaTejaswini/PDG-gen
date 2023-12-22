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
        int[] a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int[] b=a.clone();
        Arrays.sort(b);

        for(int i=0;i<n;i++){
            a[i]=a[i]-b[i];
        }

        int invCount=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0)invCount++;
        }

        if(invCount<=2) System.out.println("YES");
        else System.out.println("NO");
    }

}

