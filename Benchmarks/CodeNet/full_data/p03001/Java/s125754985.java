import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double W= sc.nextInt();
		double H = sc.nextInt();
		double x = 0;
		double y = 0;
		int kaisu = 0;
		double square = W * H;
		if(x == W/2 && y == H/2) {
			kaisu = 1;
		}
		System.out.println(square + " " + kaisu);
	}
}
