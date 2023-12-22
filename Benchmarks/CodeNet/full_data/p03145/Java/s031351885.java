import java.util.*;
public class Main {
	static int modAns = (int)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length[] = new int[3];
		for(int i = 0; i < 3; i ++) {
			length[i] = sc.nextInt();
		}
		int max = Math.max(length[0], Math.max(length[1], length[2]));
		System.out.println(length[0] * length[1] * length[2] / max / 2);
	}
}