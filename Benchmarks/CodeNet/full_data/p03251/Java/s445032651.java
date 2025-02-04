import java.util.Scanner;

public class Main {

	public static final String WAR = "war";
	public static final String NO_WAR = "No War";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String lineStr = scan.nextLine();
		String[] e = lineStr.split(" ");
		int N = Integer.parseInt(e[0]);
		int M = Integer.parseInt(e[1]);
		int X = Integer.parseInt(e[2]);
		int Y = Integer.parseInt(e[3]);

		if(X >= Y) {
			System.out.print(WAR);
			scan.close();
			return;
		}
		
		lineStr = scan.nextLine();
		String[] x = lineStr.split(" ");
		
		int maxX = -999;
		for(int i = 0 ; i < N ; i++) {
			int intX = Integer.parseInt(x[i]);

			if(maxX < intX) {
				maxX = intX;
			}
		}

		if(maxX >= X) {
			System.out.print(WAR);
			scan.close();
			return;
		}
		
		lineStr = scan.nextLine();
		String[] y = lineStr.split(" ");

		int minY = 999;
		for(int j = 0 ; j < M ; j++) {
			int intY = Integer.parseInt(y[j]);
			if(minY > intY) {
				minY = intY;
			}
		}

		if(minY < Y) {
			System.out.print(WAR);
			scan.close();
			return;
		}
		
		scan.close();
		
		System.out.print(NO_WAR);
	}
}
