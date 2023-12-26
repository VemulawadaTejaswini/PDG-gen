public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intNum = scan.nextInt();
		int intH = (intNum/60)/60;
		int intNum2 = intNum - intH * 60 * 60;
		int intM = intNum2/60;
		int intS = intNum2 - intM * 60;
		System.out.println(intH + ":" + intM + ":" + intS);
	}
}
