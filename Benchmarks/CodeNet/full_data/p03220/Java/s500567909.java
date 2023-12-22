
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int T = Integer.parseInt(scan.next());
		int A = Integer.parseInt(scan.next());

		int[] H = new int[N];
		Double diff  = Math.abs(A-(T-Double.parseDouble(scan.next())*0.006));
		double min=diff;
		int min_index = 1;

		for(int i=1;i<N;i++) {
			diff = Math.abs(A-(T-Double.parseDouble(scan.next())*0.006));
			if(min > diff) {
				min = diff;
				min_index = i+1;
			}
		}
		System.out.println(min_index);

	}
}
