import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n + 1];
		arr[0] = x;
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = arr[i +1] - arr[i];
		}
		Arrays.sort(arr2);
		int d = arr2[0];
		for (int i = 1; i < n; i++) {
			if (arr2[i - 1] == arr2[i]) {
				continue;
			}
			d = cd(arr2[i], d);
		}
		System.out.println(d);
	}
	
	public static int cd(int x, int y){
		if (x % y == 0) {
			return y;
		} else {
			return cd(y, x%y);
		}
	}
}