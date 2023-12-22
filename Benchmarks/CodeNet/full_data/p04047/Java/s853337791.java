import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt() * 2;
		int arr[] = new int[n];
		for(int i = 0; i < n;i++) {
			arr[i] = in.nextInt();
		}		
		Arrays.sort(arr);
		int result = 0;
		for(int i = 1; i < n; i+=2) {
			result += Math.min(arr[i] , arr[i-1]);
		}
		System.out.println(result);
	}
}