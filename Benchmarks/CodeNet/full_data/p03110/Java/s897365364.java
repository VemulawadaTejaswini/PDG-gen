import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n   = Integer.parseInt(scanner.nextLine());
		double jpy = 0;
		double btc = 0;


		for(int i = 0; i < n; i++) {

			String[] tmp = scanner.nextLine().split(" ");
			switch(tmp[1]) {

			case "JPY":
				jpy += Integer.parseInt(tmp[0]);
				System.out.println(jpy);

				break;

			case "BTC":
				btc += Double.parseDouble(tmp[0]);
				System.out.println(btc);

				break;

			}
		}

		jpy += btc * 380000;

		System.out.println(jpy);
	}
}
