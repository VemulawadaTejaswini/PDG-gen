
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t, a[], max, max2 = 0, count = 0;
		
		n = sc.nextInt();
		t = sc.nextInt();
		a = new int[n];
		
		for(int i = 0; i < n; ++i) {
			if(i == 0) {
				a[i] = sc.nextInt();
				max = a[i];
				for(int j = i + 1; j < n; ++j) {
					a[j] = sc.nextInt();
					max = Math.max(max, a[j]);
				}
			}
			else {
				max = a[i];
				for(int j = i + 1; j < n; ++j) {
					max = Math.max(max, a[j]);
				}
			}
			if(max != a[i]) {
				if(max2 < max - a[i]) {
					max2 = max - a[i];
					count = 1;
				}
				else if(max2 == max - a[i])++count;
			}	
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
