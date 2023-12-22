import java.util.*;
public class Main{
    static int gcd(int a,int b)
    {
       int tmp;
		if(b > a) {
			tmp = a;
			a = b;
			b = tmp;
		}
 
		if(b == 0) {
			return a;
		}
 
	    int r = -1;
	    do{
	        r = a % b;
	        a = b;
	        b = r;
	    }while (r != 0);
 
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
       for(int i=n-2;i>=0;i--)
       {
           r[i]=gcd(r[i+1],a[i]);
       }
       int x=Math.max(l[n-2], r[1]);
      for(int i = 1 ; i < n-1 ; i++) {
          x = Math.max(x, gcd(l[i-1], r[i+1]));
      }
        System.out.println(x);
    }
}