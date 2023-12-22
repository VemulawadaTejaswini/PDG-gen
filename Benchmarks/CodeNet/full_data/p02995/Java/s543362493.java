import java.util.Scanner;

public class Main{
	static long f(long A, long C, long D) {
		if(A == 0) return 0;
		long mulC = A / C, mulD = A / D;
		long mulCD = A / LCM(C, D);
		return A - mulC - mulD + mulCD;
	}
	static long GCD(long x, long y) {
		if(Math.max(x, y) % Math.min(x, y) == 0) return Math.min(x, y);
		return GCD(Math.min(x, y), Math.max(x, y) % Math.min(x, y));
	}
	static long LCM(long x, long y){
		return (x / GCD(x,y)) * y;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			long A = sc.nextLong(), B = sc.nextLong(), C = sc.nextLong(), D = sc.nextLong();
			System.out.println(f(B, C, D) - f(A - 1, C, D));
		}
	}
}