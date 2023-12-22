import java.util.*;
import java.math.*;
import java.lang.String;
import java.lang.System;
import java.lang.reflect.Array;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long answer = arr[0];
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] < x + arr[0]) {
				answer += arr[i];
			} else {
				answer += x + arr[0];
			}
		}
		System.out.println(answer);
		
		
	}
}
