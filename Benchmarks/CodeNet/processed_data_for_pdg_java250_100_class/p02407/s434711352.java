public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		sc.nextLine();
		String[] data = sc.nextLine().split(" ");
		for ( int i = n-1; 1 <= i; i--) {
			sb.append(data[i] + " ");
		}
		System.out.println( sb.append(data[0]) );
	}
}
