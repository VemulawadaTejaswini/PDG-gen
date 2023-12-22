import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = Arrays.stream(sc.nextLine().split("")).mapToInt(e -> Integer.parseInt(e)).toArray();
		
		long sum = 0;
		for(int i = 0;i < (1 << s.length - 1);i++) {
			long tmp = 0;
			int p = 0;
			for(int j = 0;j < s.length;j++) {
				tmp += (long) (s[s.length - 1 - j] * mypow(10, p++));
				if((i & (1 << j)) != 0) {
					p = 0;
				}
			}
			
			sum += tmp;
		}

		System.out.println(sum);
    }
	
	private static long mypow(long a, long b) {
		long result = 1;
		for(int i = 1;i <= b;i++) {
			result *= a;
		}
		
		return result;
	}
}