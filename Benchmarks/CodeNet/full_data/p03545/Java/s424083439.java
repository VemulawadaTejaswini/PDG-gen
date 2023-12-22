import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = Integer.valueOf(scanner.nextLine());
		Integer a = n / 1000;
		n %= 1000;
		Integer b = n / 100;
		n %= 100;
		Integer c = n / 10;
		n %= 10;
		Integer d = n;
		BiFunction<Integer, Integer, Integer> adder = (a1, a2) -> { return a1 + a2; };
		BiFunction<Integer, Integer, Integer> suber = (a1, a2) -> { return a1 - a2; };
		ArrayList<BiFunction<Integer, Integer, Integer>> ops = new ArrayList(Arrays.asList(adder, suber));
		ArrayList<String> opsStr = new ArrayList(Arrays.asList("+", "-"));
		Boolean hasFound = false;
		for(int i = 0; i < 2; i++) {
			if (hasFound) break;
			for(int j = 0; j < 2; j++) {
				if (hasFound) break;
			    for(int k = 0; k < 2; k++) {
			    	if (hasFound) break;
			       Integer temp = ops.get(i).apply(a, b);
				   temp = ops.get(j).apply(temp, c);
				   temp = ops.get(k).apply(temp, d);
				   if(temp == 7) {
					  System.out.println(a + opsStr.get(i) + b + opsStr.get(j) + c + opsStr.get(k) + d +"=7");
					  hasFound = true;
					  break;
				   }
			   }
			}
		}
	}
}
