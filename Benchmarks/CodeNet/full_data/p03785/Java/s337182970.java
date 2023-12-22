
import java.util.Arrays;
import java.util.Scanner;

public class AirportBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = s.nextInt();
		int k = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int d[] = new int[n];
		int x = 0, y = 0;
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();

		}
		Arrays.sort(a);
		for (int j = 0; j < n; j++) {
			d[j] = a[j] + k;

		}
		int i = 0;
		while (i < n) {
			x = 0;
			int j = i;
			int flag = 0;
			while (j < n) {
				if (d[i] >= a[j]  && a[j] >= a[i] && (x<c)) {
					x++;
					flag = 1;
				}
				
				
				j++;
			}
			if (flag == 1) {
				y++;
			}
			
			i = i + x;
		}
		System.out.println(y);

	}

}
