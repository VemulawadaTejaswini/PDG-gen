import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<3; i++) {
			String str = sc.next();
			char moji = str.charAt(0);
			System.out.print(moji);
		}
	}
}