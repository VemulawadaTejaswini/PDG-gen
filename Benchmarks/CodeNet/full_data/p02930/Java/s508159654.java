import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	private void compute() {
		int N = scan.nextInt();
		
		
		for (int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				int d = j - i;
				int num = 1;
				while (d % 2 == 0) {
					d /= 2;
					num++;
				}
				System.out.print(num + (j == N-1 ? "" : " "));
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String...arg) {
		new Main().compute();
	}

}
