import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte n = sc.nextByte();
		byte m = sc.nextByte();
		int[] A = new int[n];
		int total = 0;
		for(int i = 0; i < n; i++) {
			int newA = sc.nextInt();
			total += newA;
			A[i] = newA;
		}
		int minimum = total / (4*m);
		boolean canSelect = false;
		for(int j = 0; j < n && !canSelect; j++) {
			if(A[j] >= minimum) {
				m--;
				if(m == 0) canSelect = true;
			}
		}
		if(canSelect) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}