import java.util.Scanner;
public class A143 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		String[] i = str.split(" ");
		int a = Integer.parseInt(i[0]);
		int b = Integer.parseInt(i[1]);
		int c = a - 2 * b;
		if(c < 0) {
			System.out.println(0);
		}else {
			System.out.println(c);
		}
	}
}
