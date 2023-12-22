public class no1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a * b;

		if(c % 2 == 0) {
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}

	}


}
