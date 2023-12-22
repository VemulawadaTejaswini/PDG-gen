import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long Max = A>B?A:B;
		long Min = A<B?A:B;
		
		for(long i=1; i<=Max; i++) {
			if(Min*i%Max==0) {
				System.out.println(Min*i);
				break;
			}
		}
	}
}