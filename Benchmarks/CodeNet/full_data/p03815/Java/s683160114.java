import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		long x = scan.nextLong();

		long  count = (x / 11) * 2;
		x = x % 11;
		if(x - 6 <= 0){
			count ++;
		}
		else {
			count ++;
			count ++;
		}
		System.out.println(count);
	}
}
