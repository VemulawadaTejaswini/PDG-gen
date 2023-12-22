import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		// System.out.println(S);
		int x1 =0;
		int x2 =2;
		int x3 =0;
		int y1 =1;
		int y2 =2;
		int y3 =0;
		x1 = (S * 2) + y1 * 2;
		x1 = x1 / 4;
		System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);


	}
}