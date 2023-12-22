import java.util.Scanner;
public class MainC {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			int a[] = new int[n];
						
			for(int i=1; i<n; i++) {
				a[i-1] = sc.nextInt();
			}
			
			int b[] = new int[n];
			
			for(int i=0; i<n;i++) {
				b[i]=0;
			}

			for(int i=0; i<n-1;i++) {
				b[a[i]-1]++;
			}
			
			for(int i=0; i<n;i++) {
				System.out.println(b[i]);
				
			}
	}
}