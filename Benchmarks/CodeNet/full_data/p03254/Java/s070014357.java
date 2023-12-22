import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[N];
		int num = 0;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int i = 0; i < N; i++) {
			sum += a[i];
			if(sum > x) {
				num = i;
				break;
			}
			
			if((i == (N - 1)) && (sum != x)) {
				num = i;
			} else if((i == (N - 1)) && (sum == x)) {
				num = i + 1;
			}
			
		}
		
		System.out.println(num);
	
	}
}
