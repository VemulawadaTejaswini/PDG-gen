import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] b = new int[n-1];
		int [] a = new int[n];
		int ans = 0;
		b[0] = stdIn.nextInt();
		a[0] = b[0];
		ans += a[0];
		a[1] = b[0];
		for(int i = 1; i < b.length; i++) {
			b[i] = stdIn.nextInt();
			
			if(b[i-1] >= b[i]) {
				a[i] = b[i];
				a[i+1] = b[i];
			}else {
				a[i+1] = b[i];
			}
		}
		
		for(int i = 1; i < a.length; i++) {
			ans += a[i];
		}

		System.out.println(ans);
	}

}
