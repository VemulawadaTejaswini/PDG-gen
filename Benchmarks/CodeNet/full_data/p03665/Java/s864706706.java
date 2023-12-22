import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,P;
		N =sc.nextInt();
		P =sc.nextInt();
		long oddCount=0,plusCount=0;
		long sum;
		for (int i=0;i<N;i++) {
			if (sc.nextInt()%2==0) {
				plusCount++;
			} else {
				oddCount++;
			}
		}
		if (P==1) {
			long plan =0;
			for (int i=1;i<=oddCount;i+=2) {
				plan +=C(i,oddCount);
			}
			sum =plan*nijyou(plusCount);
		} else {
			long plan =0;
			for (int i=0;i<=oddCount;i+=2) {
				plan +=C(i,oddCount);
			}
			sum =plan*nijyou(plusCount);
		}
		System.out.println(sum);
	}

	private static long nijyou(long n) {
		long result =1;
		for (int i=0;i<n;i++) {
			result =result *2;
		}
		return result;
	}
	private static long C(int m,long n) {
		long result =1;
		if (m>n/2) {
			m = (int)n-m;
		}
		for (int i=0;i<m;i++) {
			result= result *(n-i);
		}
		for (int i=1;i<=m;i++) {
			result = result/i;
		}
		if (result<0) {
			System.out.println("Error");
		}
		return result;
	}
}