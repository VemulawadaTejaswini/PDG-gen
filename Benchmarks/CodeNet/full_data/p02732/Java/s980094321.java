import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			int aret = 0;
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(a[i]==a[j]) {
						aret++;
					}
				}
			}
			
			int[] num = new int[n+1];
			
			for(int i=0;i<n;i++) {
				num[a[i]]++;
			}
			
			for(int i=0;i<n;i++) {
				System.out.println(aret-num[a[i]]+1);
			}
			
			
	    }
				
	}
