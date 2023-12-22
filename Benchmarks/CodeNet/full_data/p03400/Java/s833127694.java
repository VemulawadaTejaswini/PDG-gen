import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] peaple = new int[len];

		for (int i = 0; i < len; i++) {
			peaple[i] = Integer.parseInt(sc.nextLine());
		}

		Main main = new Main();

		System.out.println(main.solve(len,line[0],line[1],peaple));
	}

	public int solve(int len,int d,int x,int[] peaple) {
		int let =0;
		int sum =0;

		for (int i = 0; i < len; i++) {
			let = 1;
			sum += let;
			while (true) {
				let = let + peaple[i];
				if (let > d) {
					break;
				}
				sum++;
			}
		}
		return sum + x;
	}
}