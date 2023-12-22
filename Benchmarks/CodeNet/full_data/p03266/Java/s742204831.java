import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long k = in.nextLong();
		
		long num = n/k;
		if(k%2==1) {
			System.out.println(num*num*num);
		}else {
			long num2 = n/(k/2);
			long num3 = num2 - num;
			System.out.println(num3*num3*num3+num*num*num);
		}

	}

}
