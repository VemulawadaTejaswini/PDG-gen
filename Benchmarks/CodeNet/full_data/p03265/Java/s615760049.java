import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = x2-(y2-y);
		int y3 = y2+(x2-x);
		int x4 = x3-(x2-x);
		int y4 = y3-(y2-y);
		System.out.print(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}
