import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int r = sc.nextInt();

		if ( n >= 10 ) {
			System.out.println(r);
		} else {
			int i = r + 100*(10-n);
			System.out.println(i);
		}
	}
}