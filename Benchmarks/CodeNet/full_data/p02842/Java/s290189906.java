public class Main {
	public static void main(String[] args) {

		final int N = new java.util.Scanner(System.in).nextInt();
		double floor = N / 1.08;
		double ceil = (N+1) / 1.08;

		int initialNum = (int) floor;

		while(true) {
			if(floor <= initialNum && initialNum < ceil) {
				System.out.println(initialNum);
				break;
			}
			initialNum++;
			if(initialNum >= ceil) {
				System.out.println(":(");
				break;
			}
		}


	}
}
