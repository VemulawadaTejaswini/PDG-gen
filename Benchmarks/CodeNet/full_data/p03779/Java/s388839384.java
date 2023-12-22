import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X= sc.nextInt();
		int count =0;
		int sum =0;
		while (count<X) {
			sum +=count;
			count ++;
		}
		System.out.println(count);

	}
}