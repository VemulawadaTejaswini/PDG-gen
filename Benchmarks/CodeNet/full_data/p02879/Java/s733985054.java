import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String i = scan.nextLine();
		String[] s = i.split(" ");
		byte a = Byte.parseByte(s[0]);
		byte b = Byte.parseByte(s[1]);
		if(a < 10 && b < 10) {
			System.out.println(a*b);
		}else {
			System.out.println(-1);
		}
	}
}
