import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double a = (w * h) / 2;
		
		System.out.print(a + " ");
		
		if ((w / 2) == x && (h / 2) == y) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}
	}	
}
