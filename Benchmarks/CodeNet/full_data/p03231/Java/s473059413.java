import java.util.Scanner;
import java.util.TreeMap;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
			long m = sc.nextLong();
			
			char[] s = sc.next().toCharArray();
			char[] t = sc.next().toCharArray();
			
			long l = lcm(n,m);
			
			TreeMap<Long,Character> x = new TreeMap<Long,Character>();
			
			
			for(int i=0;i<=(n-1);i++) {
				x.put((i*l/n), s[i]);
			}
			
			
			
			for(int i=0;i<=(m-1);i++) {
				if(x.containsKey((i*l/m)) && x.get((i*l/m))!=t[i]) {
					System.out.println(-1);
					return;
				}
			}
			
			System.out.println(l);
			
			
		}
		
		static long lcm (long a, long b) {
			long temp;
			long c = a;
			c *= b;
			while((temp = a%b)!=0) {
				a = b;
				b = temp;
			}
			return (c/b);
		}
		
	}
