public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			char[] n = sc.next().toCharArray();
			String ans = "a";
			if (Character.isUpperCase(n[0])) {
				ans = "A";
			}
			System.out.println(ans);
		} catch (Exception e) {
		}
	}
}
