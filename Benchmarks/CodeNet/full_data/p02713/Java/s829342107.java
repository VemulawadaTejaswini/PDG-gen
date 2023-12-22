import java.util.Scanner;
class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int K = Integer.parseInt(sc.next());
		int gcdTotal = 0;
		for(int a=1; a<=K; a++) {
			for(int b=1; b<=K; b++) {
				for(int c=1; c<=K; c++) {
					gcdTotal += getGcd(c,getGcd(a, b));
				}
			}
		}
		System.out.println(gcdTotal);
	}

	private static int getGcd(int a, int b) {
		while(true) {
			int d = b;
			if(a%b == 0)break;
			b = a%b;
			a = d;
		}
		return b;
	}
}