import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long counter = 0;
		for(int i=0;i<n;i++) {
			long num = in.nextLong();
			counter += countNumberDividingTwo(num);
		}
		System.out.println(counter);

	}
	
	public static long countNumberDividingTwo(long num) {
		long counter = 0;
		while(num%2==0) {
			num /= 2;
			counter++;
		}
		return counter;
	}

}