import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			long ret = 0;
			
			long stc = a/c;
			long enc = b/c;
			long std = a/d;
			long end = b/d;
			

			
			System.out.println((b-a+1)-((b/c-calc(a,c)+1)+(b/d-calc(a,d)+1)-(b/(lcm(c,d))-calc(a,lcm(c,d))+1)));
			
	    }
		
		static long calc(long i,long j) {
			if(i%j==0) {
				return i/j;
			}else {
				return i/j+1;
			}
		}
		
		static long lcm (long a, long b) {
			long temp;
			long c = a;
			c *= b;
			while((temp = a%b)!=0) {
				a = b;
				b = temp;
			}
			return (long)(c/b);
		}
				
	}
