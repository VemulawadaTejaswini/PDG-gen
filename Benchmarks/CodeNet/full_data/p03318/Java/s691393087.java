
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long sunuke = 19;
		for(int i = 1; i < k; i++) {
			if(i < 10) {
				System.out.println(i);
			} else {
				System.out.println(sunuke);
				sunuke += 10;
			}
		}

	}

}
