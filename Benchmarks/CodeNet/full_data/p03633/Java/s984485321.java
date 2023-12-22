import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] T = new long[N];
		for(int i=0;i<N;i++){
			T[i] = sc.nextLong();
		}
		long lcm = 1;
		long m = T[1];
		long n = T[0];
		long gcd;
		long temp;
		while(m % n != 0){
			temp = n;
			n = m % n;
			m = temp;
		}
		gcd = n;
		lcm = (long)((double)T[0] * T[1] / gcd);
		for(int i=2;i<N;i++){
			m = T[i];
			n = lcm;
			while(m % n != 0){
				temp = n;
				n = m % n;
				m = temp;
			}
			gcd = n;
			lcm = (long)((double)lcm * T[i] / gcd);
		}
		System.out.println(lcm);
	}

}
