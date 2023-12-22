import java.util.*;
public class Main {
    static int gcd(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; ++i){
            a[i] = in.nextInt();
        }
       int l[]=new int[n];
       int r[]=new int[n];
       l[0]=a[0];
       r[n-1]=a[n-1];
       for(int i=1;i<n;i++)
       {
           l[i]=gcd(l[i-1],a[i]);
       }
       for(int i=n-2;i>=1;i--)
       {
           r[i]=gcd(r[i+1],a[i]);
       }
       int x=Math.max(l[1], r[n-2]);
      for(int i = 1 ; i < n-1 ; i++) {
          x = Math.max(x, gcd(l[i-1], r[i+1]));
      }
        System.out.println(x);
    }
}