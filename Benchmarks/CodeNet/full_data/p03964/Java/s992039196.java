import java.util.Scanner;

class Main{
	static long GCD(long x, long y) {
		if(Math.max(x, y) % Math.min(x, y) == 0) return Math.min(x, y);
		return GCD(Math.min(x, y), Math.max(x, y) % Math.min(x, y));
	}
	static int GCD(int x, int y) {
		return (int)GCD((long)x, (long)y);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T = sc.nextLong(), A = sc.nextLong();
		for(int i = 1; i < N; i++) {
			long Ti = sc.nextLong(), Ai = sc.nextLong();
			if(Ti >= T && Ai >= A) {
				T = Ti; A = Ai;
				continue;
			}
			// Ti * k >= T となるk, Ai * k >= Aとなるkを求める
			long kT = T / Ti, kA = A / Ai;
			if(T % Ti != 0) kT++;
			if(A % Ai != 0) kA++;
			long k = Math.max(kT, kA);
			T = Ti * k; A = Ai * k;
		}
		System.out.println(T + A);
	}
}