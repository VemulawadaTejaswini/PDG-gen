import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 2 => 2 1 => 1
		// 3 => 2 3 1 => 3
		// 4 => 2 3 4 1 => 6
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ret = 0;
		for(int i = 1 ; i < N ; ++i){
			ret += i % (i + 1);
//			System.out.println(i % (i + 1));
		}
		System.out.println(ret);
	}
}
