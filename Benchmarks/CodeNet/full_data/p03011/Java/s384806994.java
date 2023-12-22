import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] line = new int[3];

		for (int i = 0; i < 3; i++) {
			line[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				if (i ==j) {
					continue;
				}
				min = Math.min(min, line[i] + line[j])
			}
		}

		System.out.println(min);
	}

}
