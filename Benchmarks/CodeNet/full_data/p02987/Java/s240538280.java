import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		String[] listA =  X.split("");
		int[] listb = new int[4];
		for(int i = 0; i <= 3; i++) {
			for(int c = 0; c <= 3; c++) {
				if(listA[i].equals(listA[c])) {
					listb[i]++;
				}
			}
		}

		String ans = "Yes";
		for(int i = 0; i < 3; i++) {
			if(listb[i] != 2) {
				ans = "No";
			}
		}

		System.out.println(ans);
	}
}
