import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		int N = sc.nextInt();
		//long[] a = new long[N];
		Deque<Long> deque = new ArrayDeque<Long>();
		long sunuke = 0;
		long arai = 0;

		for(int i = 0; i < N; i++){
			deque.add(sc.nextLong());
		}

		sunuke = deque.pollFirst();
		arai = deque.pollLast();

		long min = sunuke-arai;
		while(!deque.isEmpty()){
			//System.out.println(min + deque.toString());
			if(Math.abs(min + deque.getFirst())  > Math.abs(min - deque.getLast())){
				min -= deque.pollLast();
			}else{
				min += deque.pollFirst();
			}
		}
		//min = Math.abs(sunuke-arai);
		System.out.println(Math.abs(min));
	}
}