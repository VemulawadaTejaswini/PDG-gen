import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		int base = (val / 100);
		if (val <= getVal(base)) {
			System.out.println(getVal(base));
		} else {
			base++;
			System.out.println(getVal(base));
		}
	}
	public static int getVal(int base) {
		return base * 100 + base * 10 + base;
	}
}