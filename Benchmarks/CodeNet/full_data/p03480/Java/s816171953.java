import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		char prev = arr[0];
		int count = 0;
		int left = 0;
		int right = 0;
		int min = Integer.MAX_VALUE;
		for (char c : arr) {
			if (c == prev) {
				count++;
			} else {
				prev = c;
				if (left == 0) {
					left = count;
				} else {
					if (min > count) {
						min = count;
					}
				}
				count = 1;
			}
		}
		right = count;
		if (min == Integer.MAX_VALUE) {
			min = Math.max(left, right);
		}
		if (min == 1) {
			min = 2;
		}
		System.out.println(min);
	}
}
