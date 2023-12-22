import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int i = 0;
		int count = 0;
		for(i = a; i <= b; i++) {
			String str = i + "";
			if(str.charAt(0) == str.charAt(4)) {
				if(str.charAt(1) == str.charAt(3)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}