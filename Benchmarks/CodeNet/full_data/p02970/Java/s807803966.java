import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String point = sc.nextLine();
		String[] points = point.split(" ");
		int intN = Integer.parseInt(points[0]);
		int intD = Integer.parseInt(points[1]);

		int observer = (int)Math.ceil((intN / (intD*2+1)));
		System.out.println(observer);
	}
}