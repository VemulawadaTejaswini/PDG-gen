import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String[] line = sc.nextLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int X = Integer.parseInt(line[1]);
			int[] L = Arrays.stream(sc.nextLine().split(" ")).mapToInt(r -> Integer.parseInt(r)).toArray();

			int d = 0, i = 0;
			while (d <= X && i < L.length) d += L[i++];
			System.out.println(i);
		}
	}
}