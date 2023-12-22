import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int[] p = new int[n];
			int[] q = new int[n];
			
			for(int i=0;i<n;i++) {
				p[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				q[i]=sc.nextInt();
			}
			
			System.out.println(Math.abs((calc(n,p))-(calc(n,q))));
			
		}
		
		
		
		public static int calc(int n,int[] x) {
			int ret =0;
			Set<Integer> memo = new HashSet<>();
			for(int i=0;i<n;i++) {
				
				
				memo.add(x[i]);
				int count = 0;
				for(int j=1;j<=x[i];j++) {
					if(!(memo.contains(j))) {
						count++;
					}
				}
				ret+=(count)*factorial(n-i-1);
			}
			
			return ret;
		}
		
		
		static int  factorial(int n){
			  if(n == 0){
			    return 1;
			  }
			  return n * factorial(n-1);
			}

	}
	

	