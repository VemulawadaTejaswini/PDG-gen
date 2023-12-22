

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss=sc.nextLine();
		int[] arr = new int[10];
		for(int i=0;i<ss.length();i++) {
			arr[Character.getNumericValue(ss.charAt(i))]++;
		}
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>ans)
				ans=arr[i];
		}
		System.out.println(ans>=3?"YES":"NO");
	}
}
