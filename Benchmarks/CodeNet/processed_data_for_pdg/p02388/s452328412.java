public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextInt();
		long count = 1;
		for(int i=0;i<3;i++) {
			count *=x;
		}
		System.out.println(count);
	}
}
