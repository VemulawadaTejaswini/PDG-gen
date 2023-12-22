import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			long[] a = new long[n];
			long[] num = new long[n+1];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
				num[(int)a[i]-1]++;
			}
			
			long aret = 0;
			
			for(int i=0;i<n;i++) {
				if(num[i]<=1) {
					continue;
				}else {
					aret+=num[i]*(num[i]-1)/2;
				}
				
			}
			
			for(int i=0;i<n;i++) {
				System.out.println(aret-num[(int)a[i]-1]+1);
			}
			
			
	    }
				
	}
