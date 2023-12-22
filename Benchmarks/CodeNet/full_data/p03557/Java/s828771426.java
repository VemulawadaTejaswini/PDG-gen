
import java.util.*;

public class Main {
	
	public static int halflower(int a[], int t) {		
		int r = a.length - 1, l = 0;
		int m;
		
		while(l < r) {
			m = (r + l) / 2;
			if(r - l <= 1) {
				if(a[m + 1] < t)return m + 1;
				else if(a[m + 1] >= t && a[m] < t)return m;
				else return m - 1;
			}
			else {
				if(a[m] >= t)r = m;
				else l = m;
			}
		}
		
		if(a[0] < t)
		return 0;
		else return -1;
	}
	
	public static int halfupper(int a[], int t) {
		int r = 0, l = a.length - 1;
		int m;
		
		while(r < l) {
			m = (r + l) / 2;
			if(l - r <= 1) {
				if(a[m] > t)return m;
				else if(a[m] <= t && a[m + 1] > t)return m + 1;
				else return m + 2;
			}
			else {
				if(a[m] <= t)r = m;
				else l = m;
			}	
		}
		
		if(a[0] > t)
		return 0;
		else return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int a[][];
		
		n = sc.nextInt();
		a = new int[3][n];
		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < n; ++j) {
				a[i][j] = sc.nextInt();
			}
		}
		
		//sort
		for(int i = 0; i < 3; ++i) {
			Arrays.sort(a[i]);
		}
		
		
		long ans = 0;
		long tmp, tmp2;
		for(int i = 0; i < n; ++i) {
			tmp = (long)halflower(a[0], a[1][i]);
			tmp2 = (long)halfupper(a[2], a[1][i]);
			ans += (tmp + 1) * (n - tmp2);
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
