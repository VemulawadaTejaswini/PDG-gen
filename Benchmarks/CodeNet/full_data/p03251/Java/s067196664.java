import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		String line3 = sc.nextLine();
		sc.close();
		
		String[] values1 = line1.split(" ");
		String[] valuesX = line2.split(" ");
		String[] valuesY = line3.split(" ");
		
		int maxX = -100;
		for (String x : valuesX) {
			maxX = Math.max(maxX, Integer.parseInt(x));
		}
		int minY = 100;
		for (String y : valuesY) {
			minY = Math.min(minY, Integer.parseInt(y));
		}
		List<String> valuesZ = new ArrayList<>();
		for (int i=Integer.parseInt(values1[2])+1; i<=Integer.parseInt(values1[3]); i++) {
			valuesZ.add(String.valueOf(i));
		}

		String ans = "War";
		for (String value : valuesZ) {
			if (maxX < Integer.parseInt(value) && Integer.parseInt(value) <= minY) {
				ans = "No War";
				break;
			}
		}
		System.out.println(ans);
	}
}