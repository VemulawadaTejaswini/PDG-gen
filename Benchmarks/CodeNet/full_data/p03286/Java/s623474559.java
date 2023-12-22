import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		String str = (n == 0) ? "0" : "";
		while (n != 0) {
			if(n % 2 != 0) {
				n--;
				str = "1" + str;
			}else {
				str = "0" + str;
			}
			n /= -2;
		}
		System.out.println(str);
	}
}
