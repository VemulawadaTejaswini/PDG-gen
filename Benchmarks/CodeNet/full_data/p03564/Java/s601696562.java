import java.util.Scanner; 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 1;
		int N = scan.nextInt();
		int K = scan.nextInt();
		for(int i = 0; i < N; i++) {
			if(x * 2 < x + K) x = x * 2;
			else x = x + K;
		}
		System.out.println(x);
		scan.close();
	}
}
