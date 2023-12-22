import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double W = sc.nextInt();
		double H = sc.nextInt();
		double x = sc.nextInt();
		double y = sc.nextInt();
		System.out.print(W*H/2 + " ");
		if(x == W/2 && y == H/2)
			System.out.println(1);
		else
			System.out.println(0);

	}

}