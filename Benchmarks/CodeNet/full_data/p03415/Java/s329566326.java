import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] strArr = new String[3];

		for (int i = 0; i < 3; i++) {
			strArr[i] = s.next();
		}
		for (int j = 0; j < 3; j++) {
			System.out.print(strArr[j].substring(j, j+1));
		}
	}
}