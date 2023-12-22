import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ary = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(ary);
		System.out.println(ary[0] + ary[1]);
	}
}
