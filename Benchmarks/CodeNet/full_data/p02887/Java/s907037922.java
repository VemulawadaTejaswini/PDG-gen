import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		int count = 1;

		for(int i=0; i<S.length()-1; i++) {
			String a = S.substring(i,i+1);
			String b = S.substring(i+1,i+2);
			if(!a.equals(b)) {
				count++;
//				S = S.substring(0,i+1)+S.substring(i+2);
//				i--;
			}
		}
//		System.out.println(S.length());
		System.out.println(count);
	}
}
