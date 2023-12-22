import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] wrongCounts = new int[n];
			boolean[] corrects = new boolean[n];
			int totalAC = 0;

			for( int i = 0 ; i < m ; i++ ) {
				int index = sc.nextInt() - 1;
				String ans = sc.next();

				if ( corrects[index]) {
					// no count
				}
				else if ( ans.equals("WA")) {
					wrongCounts[index]++;
				}
				else if ( ans.equals("AC")) {
					corrects[index] = true;
					totalAC++;
				}
			}

			//calc total Wrong count
			//				int totalWrong = Arrays.stream(wrongCounts).sum();
			int totalWrong = 0;
			for(int i = 0 ; i < n ; i++ ) {
				if ( corrects[i]) {
					totalWrong += wrongCounts[i];
				}
			}

			System.out.println(String.format("%d %d", totalAC, totalWrong));

		}
	}
}