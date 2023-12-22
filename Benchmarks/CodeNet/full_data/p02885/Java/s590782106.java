import java.util.Scanner;
import java.util.function.BiConsumer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		BiConsumer<Integer, Integer> consumer = (i, j) -> {
			if (i <= 2 * j) {
				System.out.println(0);
			} else {
				System.out.println(i - 2 * j);
			}
		};
		consumer.accept(a, b);

	}

}
