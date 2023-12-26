public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = 0;
		int H = 0;
		for (int i = 0; i < N; i++) {
			String Taro = sc.next();
			String Hana = sc.next();
			if (Taro.compareTo(Hana) == 0) {
				T++;
				H++;
			} else if (Taro.compareTo(Hana) > 0) {
				T += 3;
			} else {
				H += 3;
			}
		}
		System.out.println(T + " " + H);
	}
}
