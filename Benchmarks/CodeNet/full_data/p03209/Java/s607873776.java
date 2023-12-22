import java.util.*;

public class Main {
	public static long[] size = new long[51];
	public static long[] point = new long[51];
	
	public static void main(String[] args){
		size[0] = 1;
		point[0] = 1;
		for (int i = 1; i < 51; i++) {
			size[i] = size[i - 1] * 2 + 3;
			point[i] = point[i - 1] * 2 + 1;
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //整数の入力
		long x = sc.nextLong();
		System.out.println(count(n, x));
		
	}
	
	public static long count(int level, long end) {
		if (level == 0) {
			return 1;
		}
		if (end > size[level]) {
			return point[level];
		}
		long total = 0;
		end--;
		if (end <= 0) {
			return total;
		}
		total += count(level - 1, end);
		end -= size[level - 1];
		if (end <= 0) {
			return total;
		}
		end--;
		total++;
		if (end <= 0) {
			return total;
		}
		total += count(level - 1, end);
		return total;
	}
	
}