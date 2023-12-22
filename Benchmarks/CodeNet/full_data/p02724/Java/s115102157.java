import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long X = scan.nextLong();
		long sum = 0;
		sum += (X/500)*1000;
		sum += ((X%500)/5)*5;
		System.out.println(sum);
	}
}