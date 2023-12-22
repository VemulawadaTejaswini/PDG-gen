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
		int[] num = new int[N];
		int check = 0;
		int count = 1;
		
		for(int i = 1; i < N; i++) {
			if(a[i] == a[i - 1]) {
				count++;
				if(i == N - 1 && count >= a[i - 1]) {
					num[check] = count - a[i];
				} else if(i == N - 1 && count < a[i - 1]) {
					num[check] = count;
				}
			} else {
				if(count >= a[i - 1]) {
					num[check] = count - a[i - 1];
					count = 1;
					check++;
				} else {
					num[check] = count;
					count = 1;
					check++;
				}
			}
		}
		Arrays.sort(num);
		int min = 0;
		
		for(int i = 0; i < num.length; i++) {
			min += num[i];
		}
		if(N > 1) {
			System.out.println(min);
		} else if(N == 1 && a[0] == 1) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}
