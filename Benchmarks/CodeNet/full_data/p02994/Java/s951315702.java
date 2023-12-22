import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int l = s.nextInt();
		int array[] = new int[n];
		int sum = 0;
		for (int a = 0; a < array.length; a++) {
			array[a] = a + l;
			sum += a + l;
		}
		int min = 999;
		for (int a = 0; a < array.length; a++)
			min = Math.min(min, Math.abs(array[a]));
		System.out.println(sum - min);
	}
}