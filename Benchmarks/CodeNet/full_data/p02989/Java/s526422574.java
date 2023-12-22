package sd;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int sum=arr[n/2]-arr[n/2-1];
		System.out.println(sum);
	}
}
