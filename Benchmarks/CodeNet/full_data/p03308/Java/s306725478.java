import java.io.*;
import java.util.*;

public class Main {
	private static final int READ_COUNT = 2;
	private static List<String> strList = new ArrayList<>();
	
	public static void main(String[] args) {
		read();
		
		int n = Integer.parseInt(strList.get(0));
		String[] as = strList.get(1).split(" ");
		
		int min = Integer.parseInt(as[0]);
		int max = min;
		
		for (int i = 1; i < n; i++) {
			int num = Integer.parseInt(as[i]);
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		
		System.out.println(max - min);
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
