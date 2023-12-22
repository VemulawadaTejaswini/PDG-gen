import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long diff[] = new long[num];
		for(int i = 0; i < num; i ++) {
			diff[i] = sc.nextLong();
		}
		Arrays.sort(diff);
		System.out.println(diff[num / 2] - diff[num / 2 - 1]);
	}
}