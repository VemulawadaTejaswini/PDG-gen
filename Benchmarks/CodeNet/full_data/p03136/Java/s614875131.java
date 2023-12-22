
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> len = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		double t = Double.parseDouble(sc.next());
		int max = 0;
		int sum =0;
		sc = new Scanner(new StringReader(sc.next()));
		while (sc.hasNextInt()) {
		len.add(sc.nextLine());
		}

		for (String l :len) {
			int i =Integer.parseInt(l);
			if(i>max) {
				max=i;
			}
			sum += i;
		}
		if(max<(sum-max)) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}

	}
}
