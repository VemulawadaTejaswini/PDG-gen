import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int wait = a[0], ans = 0, cnt = 0;
		for(int i = 0; i < n; i++){
			if(cnt == c||a[i] - wait > k){
				ans++;
				cnt = 1;
				wait=a[i];
			}
			cnt++;
		}
		System.out.println(ans);
	}
}