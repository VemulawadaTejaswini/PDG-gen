import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] values = new int [3];
		for (int i = 0; i < 3; i++) {
			values[i] = sc.nextInt();
		}
		Arrays.sort(values);
		int val = values[2] * 10 + values[1];
		System.out.println(val + values[0]);
	}
}
