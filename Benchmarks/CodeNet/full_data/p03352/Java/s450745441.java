import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int x = 0;
		int max = 0;

		Scanner scan = new Scanner(System.in);
		x = Integer.parseInt(scan.next());

		for(int i=1;i<=x;i++) {
			for(double j=2.0;j<10.0;j++) {
				double num = Math.pow(i,1.0/j);
				int h1 = (int)num;
				double h2 = (double)h1;

				if(num == h2) {
					max = i;
				}
			}
		}
		System.out.println(max);
	}
}
