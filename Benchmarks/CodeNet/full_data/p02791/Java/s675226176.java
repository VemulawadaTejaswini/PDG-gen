import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int counter = 0;
		int min = 100;
		ArrayList<Integer> pi = new ArrayList<Integer>();
		for(int i=0; i<n; ++i) {
			int numPi = Integer.parseInt(scan.next());
			// 初回はインクリメントonly
			if(i==0) {
				counter++;
			} else {
				if(numPi <= min) {
					counter++;
				}
			}
			if(min > numPi) {
				min = numPi;
			}
		}
		System.out.println(counter);
	}
}