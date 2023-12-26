public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] c = s.toCharArray();
		int cunt = 0;
			if (c[0] == '1') 
				cunt++;
			if (c[1] == '1')
				cunt++;
			if (c[2] == '1') {
				cunt++;
			}
		System.out.println(cunt);
	}
}
