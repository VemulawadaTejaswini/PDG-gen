import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] L = new int [n];

		for(int i=0;i<n;i++) {
			L[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(L);
		int max = L[n-1];
		int sum = 0;
		for(int i=0;i<n-1;i++) {
			sum += L[i];
		}
		if(max < sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
