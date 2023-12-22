
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			int count = 0;
			int tempCount = 0;
			long now = sc.nextLong();
			for (int i = 1; i < size; i++) {
				long next = sc.nextLong();
				if (next <= now) {
					tempCount++;
				} else {
					if (count < tempCount) {
						count = tempCount;
						tempCount = 0;
					}
				}
				now = next;
				if (i == size - 1) {
					if (count < tempCount) {
						count = tempCount;
					}
				}
			}
			System.out.println(count);
		}
	}
}
