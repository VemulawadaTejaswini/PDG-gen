import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t1 = 0, x1 = 0, y1 = 0;
		int t2, x2, y2, t, c;
		
		for(int i=0; i<n; i++) {
			t2 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			t = t2 -t1;
			c = Math.abs((x2+y2)-(x1+y1));
			if(t >= c) {
				if(t%2 != c%2) {
					System.out.println("No");
					scan.close();
					return;
				}
			} else {
				System.out.println("No");
				scan.close();
				return;
			}
			t1 = t2;
			x1 = x2;
			y1 = y2;
		}
		scan.close();
		System.out.println("Yes");
	}

}