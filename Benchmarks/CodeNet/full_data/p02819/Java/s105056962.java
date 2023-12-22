
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long X_2 = X*X;
		int p;
		ArrayList<Long> primeNumbers = new ArrayList<Long>();
		
		primeNumbers.add((long)2);
		for(long i=3;i<2*X;i++) {
			boolean flag = true;
			for(long j : primeNumbers) {
				if(i%j==0) {
					flag=false;
				}
			}
			if(flag) {
				if(i>=X) {
					primeNumbers.add(i);
					break;
				}
				primeNumbers.add(i);
			}
		}
		System.out.println(primeNumbers.get(primeNumbers.size()-1));
	}

}
