import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Integer age = sc.nextInt();
		Integer price = sc.nextInt();

		System.out.println(calc(age,price));
	}

	private static Integer calc(Integer age, Integer price) {
		if (age<6) {
			return 0;
		} else if (age<13) {
			return (price / 2);
		} else {
			return price;
		}
	}


}
