import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();

		int dx = (x2-x1);
		int dy = (y2-y1);

		int x3 =  x2 - dy;
		int y3 =y2 +dx;
		
		int x4= x3 - dx;
		int y4 = y3 -dy;
		
		System.out.println(x3);
		System.out.println(y3);
		System.out.println(x4);
		System.out.println(y4);


	}






}
