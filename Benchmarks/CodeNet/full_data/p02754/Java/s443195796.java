import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long A = input.nextLong();
		long B = input.nextLong();
		
		long cnt=N/(A+B);
		long amari=N%(A+B);
		long x=0;
		
		if(amari>=A) {
			x=A;
		}
		else {
			x=amari;
		}
		System.out.println(A*cnt+x);
		
	}
}
