import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int L = scan.nextInt();
		String[] S = new String[N];
		BigInteger[] SNum = new BigInteger[N];
		BigInteger max = new BigInteger("28888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888887");
		BigInteger min = max;
		int minIndex = 0;
		String tmp = "";
		String[] abc = {"a", "b" , "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", 
				"r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String blank = scan.nextLine();
		for(int i = 0; i < N; i++) {
			S[i] = scan.nextLine();
		}
		for(int i = 0; i < N; i++) {
			SNum[i] = BigInteger.valueOf(0);
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < L; j++) {
				for(int k = 0; k < abc.length; k++) {
					if(abc[k].equals(S[i].substring(j, j + 1))) {
						SNum[i] = SNum[i].add(BigInteger.valueOf(10).pow(L - j - 1).multiply(BigInteger.valueOf(k + 1)));
					}
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(min.compareTo(SNum[j]) == 1) {
					min = SNum[j];
					minIndex = j;
				}
			}
			tmp += S[minIndex];
			SNum[minIndex] = max;
			min = max;
			minIndex = 0;
		}
		
		System.out.print(tmp);
		
		scan.close();
	}

}
