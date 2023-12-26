public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long deposit = 100L;
		int i =0;
		while(deposit < x) {
			deposit *= 1.01;
			i++;
		}
			System.out.println(i);
			scan.close();
	}
}
