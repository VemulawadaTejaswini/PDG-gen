import java.util.Scanner;


public class Main {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		long k = scanner.nextLong();
		printSnuke(k);
	}
	
	public static void printSnuke(long k) {
		for(int j=0;;j++) {
			for(int i=2; i <= 10; i++) {
				long snuke = (long)(Math.pow(10, j)) * i - 1;
				System.out.println(snuke);
				if(snuke > k)
					return;
			}
		}
	}

}
