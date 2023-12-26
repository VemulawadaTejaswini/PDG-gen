public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		if(N.length()==3) {
			if(N.contains("7")) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}		
		}
	}
}
