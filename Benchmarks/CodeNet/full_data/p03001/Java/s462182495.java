import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int W = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		
		System.out.print((double)W*(double)H/(double)2);
		if(x/1.0==W/2.0 &&y/1.0==H/2.0) {
			System.out.print(" ");
			System.out.println(1);
		}else {
			System.out.print(" ");
			System.out.println(0);
		}
		
		sc.close();
	}
}