import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		int pMask = 0b01010101010101010101010101010101;
		int mMask = 0b10101010101010101010101010101010;

		for(int i = 0; i <= Integer.MAX_VALUE; i++) {
			if(num == (pMask & i) - (mMask & i)) {
				System.out.println(Integer.toBinaryString(i));
				break;
			}
		}
	}
}
