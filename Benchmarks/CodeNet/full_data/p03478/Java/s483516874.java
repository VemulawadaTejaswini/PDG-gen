
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	//	  System.setIn(B083.class.getResourceAsStream("input.txt"));
		  Scanner in = new Scanner(System.in);

		  int n = in.nextInt();
		  int a = in.nextInt();
		  int b = in.nextInt();
		  int total = 0;


		  for(int i = 0; i <= n; i++) {
			  int sum = findSumOfDigits(i);
			  if(sum >= a && sum <= b) {
				  total += i;
			  }
		  }
		  System.out.println(total);
		  in.close();
	}

	public static int findSumOfDigits(int n) {
		  int sum = 0;

		  while(n > 0) {
			  sum += n % 10;
			  n /= 10;
		  }
		  return sum;
	}
}
