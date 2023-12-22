import java.io.*;
import java.util.*;

public class Main {
	private static final int READ_COUNT = 2;
	private static List<String> strList = new ArrayList<>();
	
	public static void main(String[] args) {
		read();
		
		int n = Integer.parseInt(strList.get(0));
		int[] as = new int[n];
		int tmpI = 0;
		for (String str : strList.get(1).split(" ")) {
			as[tmpI] = Integer.parseInt(str) - (tmpI + 1);
			tmpI++;
		}
		
		int minSunuke = 0;
		for (int i = 0; i < n; i++) {
			minSunuke += Math.abs(as[i]);
		}
		
		for (int i = 1; ; i++) {
			int sunuke = 0;
			
			for (int j = 0; j < n; j++) {
				sunuke += Math.abs(as[j] - i);
				if (sunuke > minSunuke) {
					break;
				}
			}
			
			if (sunuke > minSunuke) {
				break;
			}
			
			minSunuke = sunuke;
		}
		
		for (int i = -1; ; i--) {
			int sunuke = 0;
			
			for (int j = 0; j < n; j++) {
				sunuke += Math.abs(as[j] - i);
				if (sunuke > minSunuke) {
					break;
				}
			}
			
			if (sunuke > minSunuke) {
				break;
			}
			
			minSunuke = sunuke;
		}
		
		System.out.println(minSunuke);
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
