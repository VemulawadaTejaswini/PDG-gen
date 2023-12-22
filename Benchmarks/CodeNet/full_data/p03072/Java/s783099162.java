import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		in.readLine();
		String[] d = in.readLine().split(" ");
		byte max = Byte.MIN_VALUE;
		byte num = 0;
		Byte h;
		for(String c : d) {
			h = Byte.valueOf(c);
			if(h >= max) {
				num++;
				max = h;
			}
		}
		System.out.print(num);
	}
}