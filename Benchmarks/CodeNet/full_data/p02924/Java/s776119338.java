import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(mod_sum(Integer.parseInt(scanner.nextLine())));
		scanner.close();
	}
	
	public static long mod_sum(long n) {
		return (long) (n * (n + 1l)) / 2l - n;
	}

}