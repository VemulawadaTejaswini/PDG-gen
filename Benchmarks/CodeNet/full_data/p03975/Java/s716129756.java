import java.util.*;
import java.math.*;
import java.lang.String;
import java.lang.System;
import java.lang.reflect.Array;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
		if (!(arr[i] >= a && arr[i] < b)) {
		count++;
		}
		}
		System.out.println(count);


	}
}