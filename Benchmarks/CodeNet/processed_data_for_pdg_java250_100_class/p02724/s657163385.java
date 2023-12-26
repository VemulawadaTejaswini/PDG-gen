public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int ureshisa500 = total/500;
		int ureshisa5 = (total%500)/5;
		System.out.print(ureshisa500*1000 + ureshisa5*5);
	}
}
