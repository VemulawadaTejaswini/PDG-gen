import java.util.*;
import java.io.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        double ans=0.0;
        int x[]=new int[10];
        int y[]=new int[10];

        int gg=1;
        for (int i=1; i<=n; i++)
        {
            gg*=i;
        }
        for(int i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }

        for (int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                ans+=Dist(x[i],y[i],x[j],y[j]);
            }

        }
        ans*=2;
        System.out.println((double)(ans/gg));
    }

    static double Dist(int a,int b,int c,int d)
    {
        double dist=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
        return dist;
    }
}