mport java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int cLength = sc.nextInt();
			int tryCount = sc.nextInt();
			String s = sc.next();
			int count = 0;
			String base = "AC";
			for (int i = 0; i < tryCount; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				String ejection = s.substring(start - 1, end);
				count = (ejection.length() - ejection.replaceAll(base, "").length()) / base.length();
			    System.out.println(count);	
			}
		}
	}
}