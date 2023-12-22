import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean isAllPlus = true;
		boolean isAllMinus = true;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 0) {
				isAllPlus = false;
			}
			if(arr[i] > 0) {
				isAllMinus = false;
			}
		}
		if(isAllPlus) {
			System.out.println(n-1);
			for(int i = 0; i < n-1; i++) {
				System.out.println(i+" "+(i+1));
			}
		}
		if(isAllMinus) {
			System.out.println(n-1);
			for(int i = n-1; i > 0; i--) {
				System.out.println(i+" "+(i-1));
			}
		}
		throw new NullPointerException();
		//System.out.println();
	}
}