import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max = (arr[n - 1] + b - 1) / b;
		int left = 0;
		int right = max;
		while (right - left > 1) {
		    int m = (left + right) / 2;
		    int nom = b * m;
		    int count = 0;
		    for (int i = n - 1; i >= 0 && arr[i] > nom && count <= m; i--) {
		        count += (arr[i] - nom + (a - b) - 1) / (a - b);
		    }
		    if (count > m) {
		        left = m;
		    } else {
		        right = m;
		    }
		}
	    System.out.println(right);
   }
}


