
public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		scanner.nextLine();
		String input = scanner.nextLine().split(" ")[0];
		while (scanner.hasNext()) {
			String[] area = scanner.nextLine().split(" ");
			int start = Integer.valueOf(area[0]);
			int end = Integer.valueOf(area[1]);

			String temp = input.substring(start, end);

			int count = 0;
			char before = 0;
			for (char c : temp.toCharArray()) {
				if (before == 'A' && c == 'C') {
					count++;
					before = 0;
					continue;
				}
				before = c;
			}
			System.out.println(count);
		}
	}
}