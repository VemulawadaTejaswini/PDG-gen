import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrA = new int[n];
		for (int i = 0; i < n; i++) {
		    arrA[i] = sc.nextInt();
		}
		int[] arrB = new int[n];
		for (int i = 0; i < n; i++) {
		    arrB[i] = sc.nextInt();
		}
		int[] arrC = new int[n];
		for (int i = 0; i < n; i++) {
		    arrC[i] = sc.nextInt();
		}
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		Arrays.sort(arrC);
		int[] baSize = new int[n];
		int left = 0;
		for (int i = 0; i < n; i++) {
		    if (arrA[left] < arrB[i]) {
		         baSize[i] = left + 1;
		    }
		    while (left + 1 < n && arrA[left + 1] < arrB[i]) {
		        left++;
		        baSize[i] = left + 1;
		    }
		}
		int[] bcSize = new int[n];
		int right = n - 1;
		for (int i = n - 1; i >= 0; i--) {
		    if (arrB[i] < arrC[right]) {
		        bcSize[i] = n - right;
		    }
		    while(right - 1 >= 0 && arrB[i] < arrC[right - 1]) {
		        right--;
		        bcSize[i] = n - right;
		    }
		}
		long total = 0;
		for (int i = 0; i < n; i++) {
		    total += (long)baSize[i] * bcSize[i];
		}
       System.out.println(total);
	}
}
