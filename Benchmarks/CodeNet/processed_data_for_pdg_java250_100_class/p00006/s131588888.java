public class Main {
	public static void main(String[] args) {
		Scanner date = new Scanner(System.in);
		String str = date.next();
		StringBuffer result = new StringBuffer(str);
		System.out.println(result.reverse());
	}
}
