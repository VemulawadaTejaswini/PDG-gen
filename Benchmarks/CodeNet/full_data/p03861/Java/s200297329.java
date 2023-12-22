import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Long a = scan.nextLong();
		Long b = scan.nextLong();
		Long x = scan.nextLong();
		Long count = (long) 0;
		Long i = (long) 0;
		for(i = a; i <= b; i++) {
			if(i % x == 0) {
				count++;
				break;
			}
		}
		if(i > b) {
		} else {
			count = count + (b - i) / x;
		}
		System.out.println(count);
	}
}