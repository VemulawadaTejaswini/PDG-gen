public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		char[] s = S.toCharArray();
		boolean flg = true;
		for(int i=0;i<S.length()-1;i++) {
			if(s[i]==s[i+1]) {
				flg = false;
			}
		}
		if(flg) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
	}
}
