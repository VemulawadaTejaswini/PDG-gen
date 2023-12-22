import java.util.*;

public class Main {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		s.nextLine().split("");
		String arr[] = s.nextLine().split(" ");

		int diff = 0;
		int count = 0;
		
		int jnum;
		int b;
		for (int i = 0; i < arr.length - 1; i++) {
			jnum = 0;
			int a = Integer.parseInt(arr[i]);
			for (int j = i + 1; j < arr.length; j++) {
				b = Integer.parseInt(arr[j]);
				if (a > b || b < jnum) {
					continue;
				} else if ((b - a) == diff) {
					count++;
				} else if ((b - a) > diff) {
					count = 1;
					diff = (b - a);
					jnum = b;
				}
			}
		}

		System.out.println("" + count);
	}
}