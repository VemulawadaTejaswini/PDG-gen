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
		
		int count = exec(black, black2, 0, 0, 0);
		
		System.out.println(count);
	}
	
	public static int exec(boolean[] array, boolean[] array2, int index, int count1, int count2) {
		if (index >= array.length - 1) {
			return Math.min(count1, count2);
		} else {
			if (!array[++index] && array[index - 1]) {
				++count1;
				array[index] = !array[index];
			}
			if (!array2[index] && array2[index - 1]) {
				++count2;
				array2[index - 1] = !array2[index - 1];
			}
			return exec(array, array2, index, count1, count2);
		}
	}
}
