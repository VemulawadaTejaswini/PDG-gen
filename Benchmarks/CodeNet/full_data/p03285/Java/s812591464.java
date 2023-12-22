import java.io.*;
import java.util.*;

public class Main {
	private static final int READ_COUNT = 1;
	private static List<String> strList = new ArrayList<>();
	
	public static void main(String[] args) {
		read();
		
		int n = Integer.parseInt(strList.get(0));
		
		if (n % 4 == 0 || n % 7 == 0) {
			System.out.println("Yes");
			return;
		}
		
		for (int i = 1, iLen = n / 7; i <= iLen; i++) {
			if ((n - (i * 7)) % 4 == 0) {
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
	}
	
	private static void read() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			for (int i = 0; i < READ_COUNT; i++) {
				strList.add(br.readLine());
			}
		} catch (IOException e) {
		}
	}
}
