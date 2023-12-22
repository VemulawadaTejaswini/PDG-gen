import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int total1 = 0, total2 = 0;
		long ans1 = 0, ans2 = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			total1 += a[i];
			total2 += a[i];
			if(i % 2 == 0) {
				if(total1 >= 0) {
					ans1 += total1 + 1;
					total1 = -1;
				}
				if(total2 <= 0) {
					ans2 -= total2-1;
					total2 = 1;
				}
			}
			else {
				if(total2 >= 0) {
					ans2 += total2 +1;
					total2 = -1;
				}
				if(total1 <= 0) {
					ans1 -= total1-1;
					total1 = 1;
				}
			}
		}
		System.out.println(Math.min(ans1, ans2));
	}

}