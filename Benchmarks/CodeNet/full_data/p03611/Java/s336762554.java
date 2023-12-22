import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] a = new int[N];
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int count = 0;
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			if(i == 0 || a[i] != a[i - 1]) {
				for(int j = i; j < N; j++) {
					if(a[i] + 2 >= a[j]) {
						count++;
					} else {
						break;
					}
				}
				max = Math.max(count, max);
				count = 0;
			}
		}
		System.out.println(max);
	}
}
