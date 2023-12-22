import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			long[] d = new long[100001];
			
			
			for(int i=0;i<n;i++) {
				int val = sc.nextInt();
				d[val]++;
			}
			
			int ret = 0;
			long sum = 0;
			
			for(int i=0;sum<=n/2;i++) {
				sum += d[i];
				if(sum==n/2) {
					ret++;
				}
			}
			
			System.out.println(ret);
			
			
	    }
		
	}
	
