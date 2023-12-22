
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int qq = sc.nextInt();
		int counter = 0;

		int[] l = new int[m];
		int[] r = new int[m];

		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		for (int j = 0; j < qq; j++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			counter= 0 ;
			
			for(int i = 0; i < m; i++) {
				if(l[i] < p) {
					continue;
				}else if(r[i] > q) {
					continue;
				}else {
					counter++;
				}
			}
			System.out.println(counter);
		}

	}

}