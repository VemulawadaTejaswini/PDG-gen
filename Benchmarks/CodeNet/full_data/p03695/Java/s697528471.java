import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static Scanner scan=new Scanner(System.in);
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	static long lcm (int a, int b) {return a*b/gcd(a,b);}
	static int max(int a,int b) {return a>b?a:b;}
	static int min(int a,int b) {return a<b?a:b;}
	static long factorial(int i) {return i==1?1:i*factorial(i-1);}
	static int lower_bound(int a[],int key) {
		int low=0,high=a.length;
		while(low<high) {
			int mid=((high-low)/2)+low;
			if(a[mid]<=key)low=mid+1;
			else high=mid;
		}
		return high;
		}
	static int upper_bound(int a[],int key) {
		int low=0,high=a.length;
		while(low<high) {
			int mid=((high-low)/2)+low;
			if(a[mid]<key)low=mid+1;
			else high=mid;
		}
		return high;
		}
	static boolean isPrime (int n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2)if(n%i==0){return false;}
		return true;
	}
	
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			boolean hai=false,tya=false,midori=false,
					mizi=false,ao=false,ki=false,dai=false,
					aka=false;
			int a=scan.nextInt();
			int b[]=new int[a];
			for(int i=0;i<a;i++)b[i]=scan.nextInt();
			Arrays.sort(b);
			int nount=0;
			for(int i=0;i<a;i++) {
				int c=b[i];
				if(c>=3200) {
					nount++;
				}
				if(c<400) hai=true;
				else if(c<800)tya=true;
				else if(c<1200)midori=true;
				else if(c<1600)mizi=true;
				else if(c<2000)ao=true;
				else if(c<2400)ki=true;
				else if(c<2800)dai=true;
				else if(c<3200)aka=true;
			}
			int cnt=0;
			if(hai)cnt++;
			if(tya)cnt++;
			if(midori)cnt++;
			if(mizi)cnt++;
			if(ao)cnt++;
			if(ki)cnt++;
			if(dai)cnt++;
			if(aka)cnt++;
			int max=cnt+nount;
			if(!hai&&!tya&&!midori&&!mizi&&!ao&&!ki&&!dai&&!aka) {
				cnt++;
			}
			System.out.print(cnt+" ");
			System.out.println(max);
		}
}