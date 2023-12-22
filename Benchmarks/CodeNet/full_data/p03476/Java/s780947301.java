import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int[] l = new int[Q];
		int[] r = new int[Q];
		int value;
		int[] ans = new int[Q];
		for(int i = 0; i < Q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			ans[i] = 0;
			value = l[i];
			while( value <= r[i]) {
				if(judgePrimeNumber(value) & judgePrimeNumber((value+1)/2)) {
					ans[i]++;
				}
				value += 2;
			}
		}
		for(int i : ans) {
			System.out.println(i);
		}
		
		
	}
	private static boolean judgePrimeNumber(int value){
		if(value == 1) {
			return false;
		}else if(value == 2) {
			return true;
		}else {
			for(int i = 2; i < value; i++) {
				if(value % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}