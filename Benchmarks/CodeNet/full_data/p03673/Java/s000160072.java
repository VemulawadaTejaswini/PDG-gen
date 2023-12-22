import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			if(n%2==0) {
				for(int i=n-1;i>0;i-=2) {
					b[(n-i-1)/2]=a[i];
					b[(n+i)/2]=a[i-1];
				}
			}else {
				for(int i=n-1;i>=0;i-=2) {
					b[(n-i-1)/2]=a[i];
					if(i!=0) {
						b[(n+i-1)/2]=a[i-1];
					}
				}
			}
			
			for(int i=0;i<n;i++) {
				if(i!=n-1) {
					System.out.print(b[i]+" ");
				}else {
					System.out.print(b[i]);
				}
				
			}
			
		}
		
		
	}
