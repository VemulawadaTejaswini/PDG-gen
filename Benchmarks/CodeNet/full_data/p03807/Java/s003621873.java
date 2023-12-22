package test;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] a = new int[n];
		int oddOfSum = 0;
		for (int i=0;i<n;i++){
			a[i] = sc.nextInt();
			if (a[i]%2==1){
				oddOfSum++;
			}
		}
		if (oddOfSum%2==1){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
		}
		
	}
}