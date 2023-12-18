public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value;
		int i = 0;
		while(true){
			value = scan.nextInt();
			if (value == 0)
				break;
			System.out.printf("Case %d: %d\n", ++i, value);
		}
	}
}
