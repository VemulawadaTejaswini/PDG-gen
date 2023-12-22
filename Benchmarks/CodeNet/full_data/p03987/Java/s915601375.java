import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int left = 0;
		int right = 0;
		long total = 0;
		for (int i = 0; i < n; i++) {
		    if (i == 0) {
		        while(right < n - 1 && arr[i] <= arr[right + 1]) {
		            right++;
		        }
		    } else {
		        if (arr[i - 1] < arr[i]) {
		            left = i;
		            right = i;
		        } else {
		            while (left > 0 && arr[left - 1] >= arr[i]) {
		                left--;
		            }
		        }
		        while(right < n - 1 && arr[i] <= arr[right + 1]) {
		            right++;
		        }
		    }
		    total += (i - (long)left + 1) * ((long)right - i + 1) * arr[i];
		}
		System.out.println(total);
   }
}


