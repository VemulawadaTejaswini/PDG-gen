public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		int s = str.indexOf('A');
		int e = str.lastIndexOf('Z');
		System.out.println(e-s+1);
	}
}
