import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String in = sc.next();
			int max = 0;
			int count = 0;
			String base = "ACGT";
			boolean continuous = false;
			for (String c : in.split("")) {
				if (base.contains(c)) {
					if (continuous) {
						count++;
					}
					else {
						count = 1;
						continuous = true;
					}
					if (count > max) {
					    max = count;
					}
					continue;
				}
				continuous = false;
			}
            System.out.println(max);
		}
	}
}