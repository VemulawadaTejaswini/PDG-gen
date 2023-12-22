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
			int a=scan.nextInt();
		    int b[]=new int[a];
          int max=0,sec=0;
          for(int i=0;i<a;i++){
            b[i]=scan.nextInt();
            if(max<b[i]){
              max=b[i];
            }else if(sec<b[i]){
              sec=b[i];
            }
            
          }
          for(int i=0;i<a;i++){
            if(b[i]==max)System.out.println(sec);
            else System.out.println(max);
          }
		}
}
