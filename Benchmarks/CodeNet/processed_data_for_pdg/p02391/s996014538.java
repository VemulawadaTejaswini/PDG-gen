public class Main {
	public static Scanner sc;
	public static void main(String[] args) {
		int a=0;
		int b=0;
		sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a<b) {
			System.out.println("a < b");
		}else if(a>b) {
			System.out.println("a > b");
		}else {
			System.out.println("a == b");
		}
	}
}
