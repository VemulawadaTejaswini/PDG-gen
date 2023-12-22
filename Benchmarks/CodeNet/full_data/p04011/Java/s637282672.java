import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int stayDay = sc.nextInt();
		int hotelDay = sc.nextInt();
		int hotelPrice = sc.nextInt();
		int hotelPriceDiscount = sc.nextInt();

		int totalPrice = 0;

		if (stayDay <= hotelDay) {
			totalPrice = stayDay * hotelPrice;
		} else {
			totalPrice = (hotelDay * hotelPrice) + ((stayDay - hotelDay) * hotelPriceDiscount);
		}
		System.out.println(totalPrice);
	}
}
