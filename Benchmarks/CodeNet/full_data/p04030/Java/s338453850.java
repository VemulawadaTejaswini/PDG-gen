import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] input = a.toCharArray();
		char[] output = new char[input.length];
		sc.close();
		int counter = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == '0') {
				output[counter] = '0';
				counter++;
			}
			else if (input[i] == '1') {
				output[counter] = '1';
				counter++;
			}
			else if (input[i] == 'B') {
				if (counter > 0) {
					counter--;
				}
			}
			else {
				
			}
		}
		String x = new String(output);
		System.out.println(x.substring(0, counter));
	}
}
