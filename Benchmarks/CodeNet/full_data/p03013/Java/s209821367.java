import java.util.Scanner;

public class Main {
	static int[] breaks;
	static int num;
	static Long[] patterns;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int m = sc.nextInt();
		breaks = new int[m];
		patterns = new Long [num + 3];
		for(int i = 0; i < m; i++){
			breaks[i] = sc.nextInt();
		}
		System.out.println(pattern(0) % 1_000_000_007);
	}
	static long pattern(int p){
		if(patterns[p] != null){
			return patterns[p];
		}
		if(p == num){
			patterns[p] = 1L;
			return 1;
		}
		if(p > num){
			patterns[p] = 0L;
			return 0;
		}
		for(int i = 0; i < breaks.length; i++){
			if(p == breaks[i]){
				patterns[p] = 0L;
				return 0;
			}
		}
		patterns[p] = pattern(p + 1) + pattern(p + 2);
		return patterns[p];
	}
}
