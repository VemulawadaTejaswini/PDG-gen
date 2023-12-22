import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		String c = "";
		int count = 0;
		if (a >= b) {
			while (count < a) {
				count++;
				c += Integer.toString(b);
			}
		} else {
			while (count < b) {
				count++;
				c += Integer.toString(a);
			}
		}
		System.out.println(c);
		kb.close();
	}
}
