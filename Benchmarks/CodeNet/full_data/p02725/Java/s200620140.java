import java.util.*;
public class Main
{public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
     int k=sc.nextInt();
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
    int dis=0;
   Arrays.sort(a);
    for(int i=0;i<n-2;i++)
     dis+=a[i+1]-a[i];
   int mf=k+a[0];
   dis+=mf-a[n-1];
    System.out.println(dis);
   }
}