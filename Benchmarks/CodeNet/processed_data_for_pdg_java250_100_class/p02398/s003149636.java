public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int startNumber = sc.nextInt();
			int endNumber = sc.nextInt();
			int divisor = sc.nextInt();
			int lastlyDivisor = 0;
			for(int i = startNumber; endNumber >= i;i++) {
				if(divisor % i == 0) {
					lastlyDivisor++;
				}
			}
			System.out.println(lastlyDivisor);
		}
}
