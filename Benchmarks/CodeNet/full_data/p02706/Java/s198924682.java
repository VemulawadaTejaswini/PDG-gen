import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		long sum = n;
		for( int i=0 ; i<m ; i++ ) {
			sum -= sc.nextInt();
		}
		System.out.println(sum < 0 ? -1 : sum);
	}

}
