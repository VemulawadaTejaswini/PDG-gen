import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int oddNum = 0;
		int fourM = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if(a[i] % 2 == 1) {
				oddNum++;
			} else if(a[i] % 4 == 0) {
				fourM ++;
			}
		}
		if((oddNum + fourM == n && oddNum <= fourM + 1)
			|| (oddNum + fourM < n && oddNum <= fourM)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}