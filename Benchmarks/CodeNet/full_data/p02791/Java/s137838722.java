import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		int c = 0;
		for(int i=0;i<n;i++) {
			boolean f = true;
			for(int j=0;j<=i;j++) {
				if (a[i] > a[j]) {
					f = false;
					break;
				}
			}
			if(f) c++;
		}
		System.out.println(c);
	}
	
	
}
