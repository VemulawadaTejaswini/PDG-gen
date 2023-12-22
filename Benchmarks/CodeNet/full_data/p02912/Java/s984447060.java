import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) { //WOOOOOOO AtCoder is HELPING!!!!!!!!!!
		//Arraylist cheese for the win
		Scanner input = new Scanner(System.in);
		PriorityQueue<Long> subs = new PriorityQueue<Long>(Comparitor.reverseOrder());
		int N = input.nextInt();
		int M = input.nextInt();
		long ans = 0;
		for (int i = 0; i < N; i++) {
			long x = input.nextLong();
			ans+=x;
			while (x>0) {
				long sub = x-x/2;
				subs.add(sub);
				x/=2;
			}
		}
		int cnt = 0;
		while (cnt < M) {
			ans-=subs.poll();
			cnt++;
			if (subs.isEmpty()) break;
		}
		System.out.println(ans);
	}
}