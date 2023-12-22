import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		ArrayDeque<Long> queue = new ArrayDeque<Long>();
		for(int i = 1; i <= 9; i++){
			queue.add((long) i);
		}
		int count = 0;
		long x = 0;
		do{
			x = queue.poll();
			count++;
			if(x % 10 != 0)queue.add(x * 10 + (x % 10) - 1);
			queue.add(x * 10 + (x % 10));
			if(x % 10 != 9)queue.add(x * 10 + (x % 10) + 1);			
		}while(count < N);
		System.out.println(x);
	}
}