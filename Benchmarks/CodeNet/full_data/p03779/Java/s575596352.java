
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner s = new Scanner(System.in);
		long l = s.nextLong();
		for(long i = 0; i < l; i++) {
			if((i + 2) * (i + 1) >= l * 2) {
				System.out.println(i + 1);
				break;
			}
		}

	}

}