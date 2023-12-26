public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String p = scanner.nextLine();	
		String _p = p+p;				
		String s = scanner.nextLine();	
		if (_p.contains(s)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		scanner.close();
	}
}
