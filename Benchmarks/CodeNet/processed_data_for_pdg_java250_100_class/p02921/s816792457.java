public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		int Count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == str2.charAt(i)) {
				Count++;
			}
		}
		System.out.println(Count);
	}
}
