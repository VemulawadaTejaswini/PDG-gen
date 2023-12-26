public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int AC = 0;
		int WA = 0;
		int TLE = 0;
		int RE = 0;
		for (int i = 0; i < N; i++) {
			switch (sc.next()) {
			case "AC" :
				AC++;
				break;
			case "WA" :
				WA++;
				break;
			case "TLE" :
				TLE++;
				break;
			case "RE" :
				RE++;
				break;
			}
		}
		System.out.println("AC x " + AC);
		System.out.println("WA x " + WA);
		System.out.println("TLE x " + TLE);
		System.out.println("RE x " + RE);
		sc.close();
	}
}
