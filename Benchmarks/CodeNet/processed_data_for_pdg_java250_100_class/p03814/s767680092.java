public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(1 + s.lastIndexOf('Z') - s.indexOf('A'));
	}
}
