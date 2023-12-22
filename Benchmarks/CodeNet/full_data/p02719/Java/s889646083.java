import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Long N = Long.parseLong(sc.next());
		Long K = Long.parseLong(sc.next());
		Long J = 0L;

		while(true) {
			if(N/K > 10) {
				J = N;
				N -= (N/K)*K;
			} else {
				J = N;
				N -= K;
			}
			if(Math.abs(J) <= Math.abs(N)) {
				break;
			}
		}
		System.out.println(Math.min(Math.abs(J), Math.abs(N)));
	}
}
