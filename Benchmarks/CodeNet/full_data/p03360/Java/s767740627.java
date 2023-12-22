import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int Aa = A * 2 * K + B + C;
		int Ba = B * 2 * K + A + C;
		int Ca = C * 2 * K + B + A;
		int Max = Math.max(Aa, Ba);
		Max = Math.max(Max, Ca);
		System.out.println(Max);
	}
}