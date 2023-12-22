import java.util.Scanner;
public class Main{
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 long n = std.nextInt();
		 int m = std.nextInt();
		 long[] a = new long[m];
		 boolean ok = true;
		 for(int i=0;i<m;i++) {
			 a[i] = std.nextInt();
			 if(i>=1) {
				 if(a[i]-a[i-1]==1) {
					 ok = false;
				 }
			 }
		 }
		 if(ok) {
			 if(m >=1) {

				 long sum =a[0]-1;
				 if(sum==0) {
					 sum=1;
				 }
				 for(int i=1;i<m;i++) {
					 long dis = a[i]-a[i-1]-2;
					 sum = sum*fib(dis+1);
					 if(sum>1000000007) {
						 sum = sum%1000000007;
					 }
				 }
				 System.out.println((sum*fib(n-a[m-1]-1+1))%1000000007);
			 }
			 else {
				 System.out.println(fib(n+1));
			 }
		 }
		 else {
			 System.out.println(0);
		 }
	 }

	    private static long fib(long num) {//n段の確率(-1すること

	        if (num == 0) {
	            return 0;
	        }
	        if (num == 1) {
	            return 1;
	        }
	        return fib(num - 1) + fib(num - 2);
	    }
}
