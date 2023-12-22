import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H=scan.nextInt();
		int N=scan.nextInt();
		int A=0;

		for(int i=0; i<N;i++) {
			A+=scan.nextInt();
		}
		if (H>=A) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}

}