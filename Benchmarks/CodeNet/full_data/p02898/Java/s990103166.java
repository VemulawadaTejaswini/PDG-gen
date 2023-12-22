import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int count = 0;

		for(int i=1; i<= N; i++) {
			if(K <= Integer.parseInt(sc.next())) count++;
		}

		System.out.println(count);
	}
}
