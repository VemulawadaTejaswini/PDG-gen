import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int a[]=new int[n];
         int b[]=new int[n];
         int c[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
             b[i]=sc.nextInt();
             c[i]=sc.nextInt();
         }
         int d[][]=new int[n][3];
         d[0][0]=a[0];
         d[0][1]=a[1];
         d[0][2]=a[2];
         
         for(int i=1;i<n;i++)
         {
             d[i][0]=Math.max(d[i-1][1],d[i-1][2] )+a[i];
             d[i][1]=Math.max(d[i-1][0], d[i-1][2])+b[i];
             d[i][2]=Math.max(d[i-1][0], d[i-1][1])+c[i];
         }
         int max=Math.max(d[n-1][0], Math.max(d[n-1][1], d[n-1][2]));
         System.out.println(max);
    }
}
