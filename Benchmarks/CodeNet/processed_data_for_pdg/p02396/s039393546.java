public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		for(int i=1;x!=0;i++) {
			System.out.println("Case "+i+": "+x);
			x=scanner.nextInt();
		}
	}
}
