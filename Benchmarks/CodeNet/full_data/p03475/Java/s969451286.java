import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if(n>=1 && n<=500) {
			int[] c = new int[n-1];
			int[] s = new int[n-1];
			int[] f = new int[n-1];
			for(int i=0; i<n-1; i++) {
				c[i] = sc.nextInt();
				s[i] = sc.nextInt();
				f[i] = sc.nextInt();
			}
			
			int[] r = new int[n];
			r[n-1] = 0;
			for(int i=0; i<n-1; i++) {
				int tmp = c[i] + s[i];
				for(int j=i+1; j<n-1; j++) {
					if(tmp>=s[j]) {
						tmp = tmp + c[j];
					}else {
						tmp = c[j] + s[j];
					}
				}
				r[i] = tmp;
				
			}
			for(int i=0; i<n; i++) {
				System.out.println(r[i]);
			}
		}
		
	
	}
}
