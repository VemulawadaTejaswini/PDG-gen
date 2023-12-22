import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long point[] = new long[5];
		for(int i = 0; i < 5; i ++) {
			point[i] = sc.nextLong();
		}
		System.out.println(point[4] - point[0] > sc.nextLong() ? ":(" : "Yay!");
	}
}