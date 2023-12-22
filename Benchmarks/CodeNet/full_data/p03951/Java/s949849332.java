import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			String s = sc.next();
			String t = sc.next();
			
			if(calc(s,t,n)!=-1) {
				System.out.println(2*n-calc(s,t,n)-1);
			}else {
				System.out.println(2*n);
			}
		}	
		
		
		static int calc(String s, String t, int n) {
			int ret = -1;
			
			for(int i=0;i<n;i++) {
				String scut = s.substring(n-i-1, n);
				String tcut = t.substring(0, i+1);
				if(scut.equals(tcut)) {
					ret=Math.max(ret, i) ;
				}
			}
			return ret;
		}
		
		
	}
