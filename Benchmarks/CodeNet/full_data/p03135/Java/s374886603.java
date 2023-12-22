import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> lst = new ArrayList<>();
		while (sc.hasNext()) {
			lst.add(Double.parseDouble(sc.next()));
		}
		double T = lst.get(0);
		double X = lst.get(1);

		System.out.println(T/X);
	}

}