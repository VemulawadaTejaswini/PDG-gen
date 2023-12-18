public class Main {
    public static void main(String[] defargs) {
		Scanner scanner = new Scanner(System.in);
		int C,integer;
		C = 1;
		while(true) {
			integer = scanner.nextInt();
			if(integer == 0)
			break;
			System.out.println("Case " + (C++) + ": " + integer);
		}
	}
}
