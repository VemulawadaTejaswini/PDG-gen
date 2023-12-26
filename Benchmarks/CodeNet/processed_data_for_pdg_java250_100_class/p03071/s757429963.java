public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in);){
			int A = Integer.parseInt(scan.next());
			int B = Integer.parseInt(scan.next());
			int max = 0;
			if(A == B) {
				max = 2 * A;
			}else if(A > B) {
				max = 2 * A - 1;
			}else {
				max = 2 * B - 1;
			}
			System.out.println(max);
		}
	}
}
