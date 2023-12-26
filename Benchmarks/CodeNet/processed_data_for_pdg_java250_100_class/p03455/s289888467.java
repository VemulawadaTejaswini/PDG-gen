public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		if((n*m)%2==0) {
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}
}
