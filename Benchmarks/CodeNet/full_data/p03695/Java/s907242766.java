

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[N];
		int[] list = new int[9];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
			if(a[i] <= 399 && a[i] >= 1) {
				list[0]++;
			} else if(a[i] <= 799 && a[i] >= 400) {
				list[1]++;
			} else if(a[i] <= 1199 && a[i] >= 800) {
				list[2]++;
			} else if(a[i] <= 1599 && a[i] >= 1200) {
				list[3]++;
			} else if(a[i] <= 1999 && a[i] >= 1600) {
				list[4]++;
			} else if(a[i] <= 2399 && a[i] >= 2000) {
				list[5]++;
			} else if(a[i] <= 2799 && a[i] >= 2400) {
				list[6]++;
			} else if(a[i] <= 3199 && a[i] >= 2800) {
				list[7]++;
			} else if(a[i] >= 3200) {
				list[8]++;
			}
		}
		for(int i = 0; i < list.length - 1; i++) {
			if(list[i] > 0) {
				sum++;
			}
		}
		System.out.print(sum + " ");
		if(list[list.length - 1] > 0) {
			if(sum + list[list.length - 1] >= 8) {
				sum = 8;
			} else {
				sum += list[list.length - 1];
			}
		}
		System.out.println(sum);
		scan.close();

	}

}
