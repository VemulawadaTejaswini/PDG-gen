import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		long N = in.nextLong();
		long p = 1;
		
		for(int i = 1; i <= N; i++){
			p = (p * i) % 1000000007;
		}
		System.out.println(p);
		
	}
}