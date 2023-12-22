package test1;

public class Q1 {

	public static void main(String[] args) {
		Integer age = Integer.parseInt(args[0]);
		Integer price = Integer.parseInt(args[1]);

		System.out.println(calc(age,price));
	}

	private static Integer calc(Integer age, Integer price) {
		if (age<6) {
			return 0;
		} else if (age<12) {
			return (price / 2);
		} else {
			return price;
		}
	}


}
