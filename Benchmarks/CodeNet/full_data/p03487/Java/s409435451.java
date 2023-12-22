import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int total = 0;
		int count = 0;
		int prev = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != prev) {
				if (prev > count) {
					total += count;
				} else {
					total+= count - prev;
				}
				prev = arr[i];
				count = 1;
			} else {
				count++;
			}
		}
		if (prev > count) {
			total += count;
		} else {
			total+= count - prev;
		}
		System.out.println(total);
	}
}
