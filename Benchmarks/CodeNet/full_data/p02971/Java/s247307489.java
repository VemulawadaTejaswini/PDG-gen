import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int max1 = a[0];
		int max2 = a[0];
		int idx = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (max1 < a[i]) {
				idx = i;
				max1 = a[i];
			} else if(max2 <= a[i]) {
				max2 = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (i != idx) {
				System.out.println(max1);
			} else {
				System.out.println(max2);
			}
		}
	}
}
