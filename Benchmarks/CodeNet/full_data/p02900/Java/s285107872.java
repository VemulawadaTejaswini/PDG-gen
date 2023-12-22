
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	static long getGcd(long a, long b){
		if(a > b){
			return getGcd(b, a);
		}
		long c = b % a;
		if(c == 0){
			return a;
		}else{
			return getGcd(c, a);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long gcd = getGcd(a, b);
		ArrayDeque<Long> deque = new ArrayDeque<>();
		for(long i = 2; i * i <= gcd; i++){
			deque.add(i);
		}
		long count = 0;
		while(deque.size() != 0){
			long n = deque.pollFirst();
			for(long i = n * 2; i * i <= gcd; i = i + n){
				deque.remove(i);
			}
			boolean flag = false;
			while(gcd % n == 0){
				flag = true;
				gcd /= n;
			}
			if(flag){
				count++;
			}
		}
		if(gcd != 1){
			count++;
		}
		System.out.println(count + 1);
	}
}

