import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		int min = 0;
		for(int i = 1;i < Math.sqrt(N);i++){
			if(N % i == 0) min = i;
		}

		System.out.println(BigDecimal.valueOf(min - 1 + N/min - 1).toPlainString());
	}
}





