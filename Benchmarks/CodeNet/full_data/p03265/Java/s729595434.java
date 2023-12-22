import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1,x2,x3,x4,y1,y2,y3,y4;
		x1 = sc.nextInt(); y1 = sc.nextInt();
		x2 = sc.nextInt(); y2 = sc.nextInt();
		System.out.println();
		int X = x2 - x1;
		int Y = y2 - y1;
		if(Y < 0) {
			x4 = x1 - Y;
			y4 = y1 + X;
			x3 = x2 - Y;
			y3 = y2 + X;
		}else {
			Y = Y * (-1);
			x4 = x1 + Y;
			y4 = y1 + X;
			x3 = x2 + Y;
			y3 = y2 + X;
		}
		/*System.out.print(x1+" "); System.out.println(y1);
		System.out.print(x2+" "); System.out.println(y2);*/
		System.out.print(x3+" "); System.out.print(y3+" ");
		System.out.print(x4+" "); System.out.println(y4);
		
	}
}