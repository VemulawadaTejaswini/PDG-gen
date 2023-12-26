public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = s.length() - s.replaceAll("1", "").length();
		System.out.println(count);
	}
}
