import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()-1;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i] > arr[i-1]) res += arr[i-1];
			else res += arr[i];
		}
		System.out.println(res+arr[n-1]);
	}

}
