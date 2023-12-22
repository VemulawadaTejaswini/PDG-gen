import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		int[] d = {Math.abs(a - b), Math.abs(b - c), Math.abs(c - a)};
		Arrays.sort(d);
		System.out.println(d[0] + d[1]);
	}
}