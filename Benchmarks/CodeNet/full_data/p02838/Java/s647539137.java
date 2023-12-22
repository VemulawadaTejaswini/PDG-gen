
import java.util.Scanner;

public class Main {
	static final int maxBinary = 60;
	static long[] pow2 = new long[60];
	static{
		long n = 1;
		for(int i = 0; i < maxBinary; i++){
			pow2[i] = n;
			n *= 2;
		}
	}
	static long mod = 2_000_000_009;
	static boolean[] toBinary(long l){
		boolean[] ary = new boolean[60];
		for(int i = 0; i < 60 ; i++){
			ary[i] = l / pow2[i] % 2 == 1;
		}
		return ary;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] binaryArys = new boolean[n][];
		for(int i = 0; i < n; i++){
			binaryArys[i] = toBinary(sc.nextLong());
		}
		long sum = 0;
		for(int i = 0; i < maxBinary; i++){
			int trueNum = 0;
			int falseNum = 0;
			for(int k = 0; k < n; k++){
				if(binaryArys[k][i]){
					trueNum++;
				}else{
					falseNum++;
				}
			}
			sum += (trueNum * falseNum * pow2[i]) % mod;
			sum %= mod;
		}
		System.out.println(sum);
	}
}
