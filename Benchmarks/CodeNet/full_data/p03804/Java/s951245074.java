
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] a = new String[n];
		String[] b = new String[m];
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		for(int i =0; i < m; i++) {
			b[i] = sc.next();
		}
		String result = "初期化";
		for(int i = 0;i <= n-m; i++) {
			if(a[i].indexOf(b[0]) != -1) {
				for(int j = 1; j < m; j++) {
					//System.out.println(i + " " + j);
					if(a[i + j].indexOf(b[j]) == -1)break;
				}
				result = "Yes";
				break;
			}
			if(i == n-m) {
				result = "No";
			}
		}
		System.out.println(result);
	}
}

