import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int total =0;
		int fivehund = x/500;
		total = fivehund * 1000;
		int a = x - (fivehund * 500);
		int fives = a / 5;
		total+= fives*5;
		System.out.println(total);
	}
	
}