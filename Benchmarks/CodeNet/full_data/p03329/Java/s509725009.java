import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		class Data {
			public int n;
			public int count;
			
			public Data(int n, int count) {
				this.n = n;
				this.count = count;
			}
		}
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Queue<Data> queue = new ArrayDeque<>();
		queue.add(new Data(N, 0));
		
		for (; ;) {
			Data d = queue.poll();
			if (d.n == 0) {
				System.out.println(d.count);
				return;
			}
			
			int six = calc(d.n, 6);
			if (six > 0) queue.add(new Data(d.n - six, d.count + 1));
			int nine = calc(d.n, 9);
			if (nine > 0) queue.add(new Data(d.n - nine, d.count + 1));
			if (six == 0 && nine == 0) {
				queue.add(new Data(d.n - 1, d.count + 1));
			}
		}
	}
	
	private static int calc(int n, int a) {
		if (a > n) {
			return 0;
		}
		int b = a;
		
		while (true) {
			if (b * a > n) {
				break;
			} else {
				b *= a;
			}
		}
		
		return b;
	}
}