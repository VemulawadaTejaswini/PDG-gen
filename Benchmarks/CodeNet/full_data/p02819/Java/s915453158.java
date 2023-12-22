import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt() + 1;
		
		boolean isPrimeNum = false;
		while (!isPrimeNum) {
			int num = k;
			isPrimeNum = IntStream.range(2, num).allMatch(c -> num % c != 0);
			if (isPrimeNum) System.out.println(num);
			k++;
		}
	}
}