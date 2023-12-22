import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner Xu=new Scanner(System.in);
		long N=Xu.nextInt();
		long k=Xu.nextInt();
		Xu.close(); 
		long num=0;
		long[] a = new long[100000];
		int r=N%k;
			for(int i=1;i<=k;i++)
			   {
					a[i]=N/k;
			   }
		    for(int i=1;i<=r;i++) a[i]++;
		    num+=a[k]*a[k]*a[k];
		    if(k%2==0)
		    	num+=a[k/2]*a[k/2]*a[k/2];
		    System.out.println(num);
		}
	}
