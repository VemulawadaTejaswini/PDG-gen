import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] sortedArr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		    sortedArr[i] = arr[i];
		}
		Arrays.sort(sortedArr);
		int first = sortedArr[n - 1];
		int second = sortedArr[n - 2];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    if (arr[i] == first) {
		        sb.append(second);
		    } else {
		        sb.append(first);
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
}
