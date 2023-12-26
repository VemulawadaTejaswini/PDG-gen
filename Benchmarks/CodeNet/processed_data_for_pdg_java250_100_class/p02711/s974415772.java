public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = 0;
		N = cin.nextInt();
		while(N>0) {
			if(N%10==7) {
				System.out.println("Yes");
				return;
			}
			N/=10;
		}
		System.out.println("No");
	}
}
