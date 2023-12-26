public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = new char[s.length()];
		for(int i=0; i<s.length(); i++) c[i] = s.charAt(i);
		for(int i=1; i<=s.length(); i++) System.out.print(c[s.length()-i]);
      		System.out.println();
	}
}
