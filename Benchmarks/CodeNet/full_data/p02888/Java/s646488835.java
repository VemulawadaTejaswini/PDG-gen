import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	static int []d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		d = new int [n];
		
		for(int i = 0;i < n ; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1 ; j < n ; j++) {
				cnt += binary_search(d[i] + d[j]) - j - 1;
			}
		}
		
		System.out.println(cnt);
	}
	
	static int binary_search(int key) {
		int left = -1;
		int right = d.length;
		
		while(right - left > 1) {
			int mid = left + (right - left)/2;
			
			if(jdg(mid , key)) {
				right = mid;
			}
			else {
				left = mid;
			}
		}
		return right;
	}
	
	static boolean jdg(int index ,int key ) {
		if(d[index] >= key)
			return true;
		else
			return false;
		
	}
}