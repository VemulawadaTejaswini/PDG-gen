import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		ArrayDeque<Long> deq = new ArrayDeque<>();
		for(long i=1;i<10;i++) {
			deq.offer(i);
		}
		long cnt = 9;
		while(cnt <=K) {
			long n = deq.poll();
			if (n%10!=0) {
				deq.offer(n*10+n%10-1);
				cnt++;
				if(cnt==K) {
					break;
				}
			} 
			deq.offer(n*10+n%10);
			cnt++;
			if(cnt==K) {
				break;
			}
			if (n%10!=9) {
				deq.offer(n*10+n%10+1);
				cnt++;
				if(cnt==K) {
					break;
				}
			} 
			
		}
		System.out.println(deq.pollLast());
	}

}