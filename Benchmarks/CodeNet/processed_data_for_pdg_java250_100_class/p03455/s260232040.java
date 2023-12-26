public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberA = sc.nextInt();
		int numberB = sc.nextInt();
		if(0 < numberA && 0 < numberB) {
			int multipl = numberA * numberB;
			String strNum;
			if(multipl % 2 == 0) {
				strNum = "Even";
			}else {
				strNum = "Odd";
			}
			System.out.print(strNum);
		}
	}
}
