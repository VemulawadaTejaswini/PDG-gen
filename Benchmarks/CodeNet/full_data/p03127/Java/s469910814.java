import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
		}
		
		Arrays.sort(map);
		
		int index = 1;
		long min = map[0];
		while (map[index] % min < min && map[index] % min != 0) {
			min = map[index] % min;
			index++;
		}
		
		
		System.out.println(min);
	}
	
}
