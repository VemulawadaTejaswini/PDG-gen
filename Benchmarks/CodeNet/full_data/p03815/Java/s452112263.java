import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long target = 0;
		Scanner sc = new Scanner(System.in);
		target = sc.nextLong();

		long res = (long) Math.floor(target / 11) * 2;
		long l2 = target % 11;
		if (target > 6) {
			res += 2;
		} else if (target > 1){
			res += 1;
		}
		
		System.out.println(res);
	}
}
