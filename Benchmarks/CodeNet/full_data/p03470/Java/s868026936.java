import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int [] a = new int[n];
		int cnt = 1;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); 
		}
		Arrays.sort(a);
		for(int i = n-1; i > 0; i--) {
			if(a[i] > a[i-1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}