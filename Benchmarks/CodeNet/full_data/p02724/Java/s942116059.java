import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = 0;
		money = scan.nextInt();
		int y500 = money / 500;
		int y5 = money%500 / 5;
		System.out.println(1000*y500 + y5*5);
	}
}