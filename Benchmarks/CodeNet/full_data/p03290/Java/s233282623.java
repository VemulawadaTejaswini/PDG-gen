import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int g = sc.nextInt();
		int[] p = new int[d];
		int[] c = new int[d];

		int bitLength = 0;
		int[] sumLength = new int[d + 1];
		sumLength[0] = 0;
		for(int i = 0;i < d;i++) {
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
			bitLength += p[i];
			sumLength[i + 1] = sumLength[i] + p[i];
		}
		
		int[] score = new int[bitLength];
		int k = 0;
		for(int i = 0;i < d;i++) {
			for(int j = 0;j < p[i];j++) {
				score[j + k] = (i + 1) * 100;
			}

			k += p[i];
		}

		long result = Long.MAX_VALUE;
		long tmp = 0;
		for(long i = 0;i < (1 << bitLength);i++) {
			long totalScore = 0;
			for(int j = 0;j < bitLength;j++) {
				if(((i >> bitLength - 1 - j) & 1) == 1) {
					totalScore += score[j];
				}
			}

			for(int j = 0;j < d;j++) {
				if((((1 << p[j]) - 1) & (i >> sumLength[sumLength.length - 1] - sumLength[j + 1])) == (1 << p[j]) - 1) {
					totalScore += c[j];
				}
			}

			if(totalScore >= g) {
				tmp = Long.bitCount(i);
				if(tmp < result) {
					result = tmp;
				}
			}
		}

		System.out.println(result);
	}
}