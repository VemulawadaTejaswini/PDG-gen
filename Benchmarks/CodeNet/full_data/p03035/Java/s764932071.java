import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int old = Integer.parseInt(str[0]);
		int price = Integer.parseInt(str[1]);

		if(old >= 13) {
			System.out.println(price);
		}else if(old <= 12 && old >= 6) {
			System.out.println(price/2);
		}else {
			System.out.println(0);
		}


	}

}
