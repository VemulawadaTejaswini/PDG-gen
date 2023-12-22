import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		boolean flag = true;
		for(int i=0;i<n;i++) {
			if( (a[i] & 1 ) == 0) {
				if (a[i] % 3 == 0 || a[i] % 5 == 0) {
					continue;
				} else {
					flag = false;
				}
			} else {
				continue;
			}
		}
		if(!flag) {
			System.out.println("DENIED");
		}else {
			System.out.println("APPROVED");
		}
	}
}
