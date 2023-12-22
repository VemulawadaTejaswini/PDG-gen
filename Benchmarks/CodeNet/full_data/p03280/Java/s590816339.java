import java.io.*;
import java.util.*;

public class Main {
	private static final int READ_COUNT = 1;
	private static List<String> strList = new ArrayList<>();
	
	public static void main(String[] args) {
		read();
		
		int a = Integer.parseInt(strList.get(0).split(" ")[0]);
		int b = Integer.parseInt(strList.get(0).split(" ")[1]);
		
		System.out.println((a * b) - (a + b - 1));
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
