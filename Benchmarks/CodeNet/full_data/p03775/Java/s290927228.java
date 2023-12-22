import java.util.Scanner;
public class Main {
	static int keta(long n) {
		int i=0;
		while(n>0) {
			i++;
			n /= 10;
		}
		return i;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		int a=keta(N);
		for(int i=1; i*i<=N ; i++) {
			if(N%i != 0) 	continue;
			int x = Math.max(keta(i),keta(N/i));
			a = Math.min(x, a);
		}
		System.out.println(a);
	}
}