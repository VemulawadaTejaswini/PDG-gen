import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bucket[] = new int[15];
		for(int i = 0; i < 3; i ++) {
			bucket[sc.nextInt()] ++;
		}
		System.out.println(bucket[5] == 2 && bucket[7] == 1 ? "YES" : "NO");
	}
}