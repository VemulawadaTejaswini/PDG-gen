public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		int count = T/A ;
		int sum = 0 ;
		for(int i = 0 ; i < count ; i ++) {
			sum += B ;
		}
		System.out.println(sum);
	}
}
