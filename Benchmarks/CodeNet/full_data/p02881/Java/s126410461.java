import java.util.ArrayList;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long n = stdIn.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		
		for(long i = 1; i <= n/2; i++) {
			if(n%i == 0) {
				long b = n/i; //商
				a.add(compare(i,b));

			}

		}

		Long min = Long.MAX_VALUE;

		
		for(int i = 0; i < a.size(); i++) {
			int d = a.get(i);
			if(min > d) {
				min = (long)d;
			}
		}
		System.out.println(min);

	}
	static int compare(long a, long b) {  //移動回数の合計を出すメソッド
		int count = 0;
		count += a-1;
		count += b-1;
		return count;
	}


}
