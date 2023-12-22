import java.io.*;
import java.util.*;

public class Main {
	private static final int READ_COUNT = 1;
	private static List<String> strList = new ArrayList<>();
	
	public static void main(String[] args) {
		read();
		
		String[] str = strList.get(0).split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		System.out.println(n % k == 0 ? 0 : 1);
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
