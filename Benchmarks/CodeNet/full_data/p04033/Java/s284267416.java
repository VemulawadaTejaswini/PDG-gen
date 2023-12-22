public class Main {
	public static void main(String[] args) throws java.io.IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int result = 0;
		for (;a <= b; a++) {
			result = a * (a + 1);
			if (result == 0) {
				break;
			}
		}
		if(result > 0){
			System.out.println("Positive");
		} else if(result < 0){
			System.out.println("Negative");
		} else if (result == 0) {
			System.out.println("Zero");
		}
	}
}