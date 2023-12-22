import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] map = new int[3];
		map[0] = sc.nextInt();
		map[1] = sc.nextInt();
		map[2] = sc.nextInt();
		Arrays.sort(map);
		System.out.println(Math.abs(map[0] - map[1]) + Math.abs(map[1] - map[2]));
	}
}