public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		for(int i=1;;i++) {
			if(calcUncap(i,a)>=b) {
				System.out.println(i);
				break;
			}
		}
	}

	public static int calcUncap(int taps, int a) {
			return a + (a - 1) * (taps-1);
	}
}