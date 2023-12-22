import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		//int b = scan.nextInt();
		int cnt = 0;
		/*N以下の自然数
		奇数である
		約数が8個ちょうど存在する*/
		for( int i = 1; i <= N; i += 2 ) {
			int yakusuu = 0;
			for( int j = 1; j <= i; j++  ) {
				if( i % j == 0 ) {
					yakusuu++;
				}
			}
			if( yakusuu == 8 ) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}