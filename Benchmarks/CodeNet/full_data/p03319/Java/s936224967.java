import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int k = sc.nextInt();
			int one = 0;
			long ret = 0;
			
			for(int i=1;i<=n;i++) {
				int x = sc.nextInt();
				if(x==1) {
					one = i;
				}
			}
			
			
			
			if(n==k) {
				ret = 1;
			}else if(one==1||one==n) {
				ret = (n-one+k-2)/(k-1);				
			}else {
				ret = ((one+k-3)/(k-1))+((n-one+k-2)/(k-1));
			}
			System.out.println(ret);
		}

	}
