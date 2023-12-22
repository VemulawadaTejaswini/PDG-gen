import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ScannerModule sm = new ScannerModule();
		String input_a = String.valueOf(sm.scanInt());
		String input_b = String.valueOf(sm.scanInt());
		int result_num = Integer.parseInt(input_a + input_b);
		int flag = 0;
		for(int i = 1; i <= result_num; i++) {
			if(result_num % i == 0) {
				if(result_num / i == i) {
					flag = 1;
				}
			}
		}
		if(flag == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
class ScannerModule {
	Scanner scanner = new Scanner(System.in);
	int scanInt() {
		return Integer.parseInt(scanner.next());
	}
	String scanString() {
		return scanner.next();
	}
}