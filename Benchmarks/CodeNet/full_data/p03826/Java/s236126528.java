import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] len = new int[4];
		Arrays.setAll(len, i -> sc.nextInt());
		int max = Math.max(len[0] * len[1], len[2] * len[3]);
		System.out.println(max);
		sc.close();
	}
}

