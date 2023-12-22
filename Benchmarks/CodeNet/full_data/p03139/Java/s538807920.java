public class Main {
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
	
		int max = a < b ? b : a;
		int min;
		if ((a + b) < n) {
			min = 0;
		} else {
			min = (a + b) - n;
		}
		System.out.println(String.valueOf(min));
		System.out.println(String.valueOf(max));
	}
}
