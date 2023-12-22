import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
		    arr[i] = (arr[i - 1] + sc.nextInt()) % k;
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
		    for (int j = i + 1; j <= n && j - i < k; j++) {
		        if ((arr[j] - arr[i] + k) % k == j - i) {
		            count++;
		        } 
		    }
		}
		System.out.println(count);
	}
}
