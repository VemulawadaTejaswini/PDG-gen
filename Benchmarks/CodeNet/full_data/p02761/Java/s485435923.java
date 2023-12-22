

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		for(int i =0, j=0; i<n || j<m; i++, j++) {
			if(i<n) {
				arr1[i] = s.nextInt();
			}
			if(j<m) {
				arr2[j] = s.nextInt();
			}
		}
	    ArrayList<Integer> isProcessed = new ArrayList<>();
	    System.out.println(guess(arr1, arr2, isProcessed));

	}

	private static int guess(int[] arr1, int[] arr2, ArrayList<Integer> isProcessed) {
		int num = 0;
		for(int i =0; i < arr1.length; i++) {
			if(!isProcessed.contains(arr1[i])) {
			num = num + ((int)Math.pow(10, arr1.length - arr1[i]))*arr2[i];
			isProcessed.add(arr1[i]);
			}
		}
		return num;
	}

}
