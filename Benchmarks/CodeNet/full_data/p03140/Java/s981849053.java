public class Main {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String A = args[1];
		String B = args[2];
		String C = args[3];
		
		char[] charA = new char[n];
		char[] charB = new char[n];
		char[] charC = new char[n];
		charA = A.toCharArray();
		charB = B.toCharArray();
		charC = C.toCharArray();
		
		int ret = 0;
		for (int i = 0; i < n; i++) {
			if (charA[i] != charB[i] && charA[i] != charC[i] && charB[i] != charC[i] ) {
				ret = ret + 2;
			} else if (charA[i] != charC[i] || charA[i] != charB[i]) {
				ret++;
			}
		}
		System.out.println(String.valueOf(ret));
	}
}
