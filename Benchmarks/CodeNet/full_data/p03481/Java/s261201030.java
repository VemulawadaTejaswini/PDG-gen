import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//数列
		ArrayList<Long> list = new ArrayList<Long>();
		long a, b;
		
		//数列の数
		long count = 0;
		
		//数値取得
		Long x = scan.nextLong();
		Long y = scan.nextLong();
		
		
		long t = 0, i;
		//1,2は無視
		if (x == 1 || x == 2) {
			System.out.println(x);
			
		}else {
		
			a = x;
			b = x * 2;
			t = b;
			for (i = 2; t <= y; i++) {
				t *= 2;
				//System.out.println(t);
			}
			System.out.println(i-1);
		}
	}
}
