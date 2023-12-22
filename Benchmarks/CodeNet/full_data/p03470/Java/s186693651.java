import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int cnt=1;
		for(int i=0; i<n;i++) {
			if(a[i]<a[i+1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
