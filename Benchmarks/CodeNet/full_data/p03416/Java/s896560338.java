import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println(IntStream.rangeClosed(s.nextInt(), s.nextInt()).mapToObj(val -> String.valueOf(val))
				.filter(str -> new StringBuilder(str).reverse().toString().equals(str)).count());
	}
}