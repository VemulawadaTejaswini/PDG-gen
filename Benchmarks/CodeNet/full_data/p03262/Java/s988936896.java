import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);static void p(int i) {System.out.println(i);}static void p(long i) {System.out.println(i);}static void p(String i) {System.out.println(i);}static void p(double i) {System.out.println(i);}
	
	
	public static void main(String[] args) {
		int n=sc.nextInt()	;
		int x=sc.nextInt()	;
		
		int a[]=new int[n+1];
		long sum=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		a[n]=x;
		Arrays.sort(a);
		
		long minDistance=1000000009;
		
		for(int i=1;i<=n;i++) {
			minDistance=Math.min(a[i]-a[i-1], minDistance);
		}
		long ans=minDistance;
		for(int i=1;i<=n;i++) {
			if((a[i]-a[i-1])%minDistance!=0) {
				ans=1;
				break;
			}
		}
		p(ans);
	}
	
}
	
