import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int point = 0;
		for (int i = 0; i < arr.length; i++) {
			char me;
			if (i % 2 == 0) {
				me = 'g';
			} else {
				me = 'p';
			}
			if (arr[i] < me) {
				point++;
			} else if (arr[i] > me) {
				point--;
			}
		}
		System.out.println(point);
	}
}
