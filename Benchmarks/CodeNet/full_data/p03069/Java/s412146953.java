import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] black = new boolean[n];
		boolean[] black2 = new boolean[n];
		String str = sc.next();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == '#') {
				black[i] = true;
				black2[i] = true;
			}
		}
		
		black2[0] = !black2[0];
		int count1 = exec(black, 0, 0);
		int count2 = exec(black2, 0, 1);
		
		System.out.println(Math.min(count1, count2));
	}
	
	public static int exec(boolean[] array, int index, int count) {
		if (index >= array.length - 1) {
			return count;
		} else {
			if (!array[++index] && array[index - 1]) {
				++count;
				array[index] = !array[index];
			}
			return exec(array, index, count);
		}
	}
}
