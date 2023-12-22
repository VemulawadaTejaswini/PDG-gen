import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[] = new int[M];
		int b[] = new int[M];
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		int temp_a = a[0];
		int temp_b = b[0];
		int ans_cnt = 1;
		for(int i = 0; i < M; i++) {
			if(temp_a != a[i] && temp_b <= a[i]) {
				temp_a = a[i];
				temp_b = b[i];
				ans_cnt++;
			} else {
				temp_b = Math.min(temp_b, b[i]);
			}
		}
		
		System.out.println(ans_cnt);
	}
}
