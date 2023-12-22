public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n  = Integer.parseInt(in.nextLine());
		int mealPrice = 800;
		int discount = 200;
		int discountPoint = 15;
		
		int x = n * mealPrice;
		int y = (n / discountPoint) * discount;
		System.out.println(x - y);
	}
