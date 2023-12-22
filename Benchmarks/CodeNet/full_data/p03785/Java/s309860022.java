import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ans = 0, cnt = 0, wait, i;
		int n = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		wait = a[0];
		for(i = 0; i  < n; i++){
			if(cnt == c || a[i] - wait > k){
				ans++;
				cnt = 0;
				wait = a[i];
			}
			ans++;
		}
		System.out.println(ans);
	}
}
