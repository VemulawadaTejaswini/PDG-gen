import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int T = sc.nextInt();
		int a[] = new int[T];
		for (int i=0;i<T;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.parallelSort(a);
		int start =0;
		int end =T-1;
		while (start!=end) {
			if (a[start]<a[end]) {
				a[end]-=a[start];
			} else {
				a[start]-=a[end];
			}
			if (a[start]==0) {
				start++;
			}
			if (a[end]==0) {
				end--;
			}
		}
		if (a[start]>1) {
			System.out.println(a[start]-1);
		} else {
			System.out.println(0);
		}
	}
}