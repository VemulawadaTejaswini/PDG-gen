
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		int price_cake=sc.nextInt();
		int price_donut=sc.nextInt();
		
		money=money-price_cake;
		money=money-(money/price_donut)*price_donut;
		System.out.println(money);
	}

}
