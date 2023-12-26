public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int taroPoint = 0;
		int hanakoPoint = 0;
		for (int i = 0; i < n; i++) {
			String taroCade = scan.next();
			String hanakoCade = scan.next();
			int temp = taroCade.compareTo(hanakoCade);
			if (temp > 0) {
				taroPoint += 3;
			} else if (temp == 0) {
				taroPoint += 1;
				hanakoPoint += 1;
			} else if (temp < 0) {
				hanakoPoint += 3;
			}
		}
		System.out.println(taroPoint + " " + hanakoPoint);
	}
}
