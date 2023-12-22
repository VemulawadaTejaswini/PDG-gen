import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		s.nextLine().split("");
		String arr[] = s.nextLine().split(" ");

		int ans = 0;

		int diff = 0;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int a = Integer.parseInt(arr[i]);
				int b = Integer.parseInt(arr[j]);
				if (a > b) {
					continue;
				} else if ((b - a) == diff) {
					count++;
				} else if ((b - a) > diff) {
					count = 1;
					diff = (b - a);
				}
			}
		}

		System.out.println("" + count);
	}
}