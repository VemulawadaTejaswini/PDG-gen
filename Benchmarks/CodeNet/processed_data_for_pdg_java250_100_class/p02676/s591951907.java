public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();
		char [] s = new char [K];
		if (S.length() <= K) {
			System.out.println(S);
		}else {  
			for(int i = 0; i < K; i++) {
				s[i] = S.charAt(i);
				System.out.print(s[i]);
			}
			System.out.println("...");
		}
	}
}
