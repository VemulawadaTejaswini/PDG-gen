public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String gudem = a+b;
		int num = Integer.parseInt(gudem);
		String answer = "No";
		for(int i = 0; i * i < 100000; i++) {
			if(num == i * i) {
				answer = "Yes";
				break;
			}
		}
		System.out.println(answer);
	}
}
