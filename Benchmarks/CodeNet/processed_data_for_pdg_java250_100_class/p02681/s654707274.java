public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int S1 = S.length();
		String T1 = T.substring(S1-0);
		if(T.equals(S+T1)) {
					System.out.println("Yes");
		}else {
					System.out.println("No");
				}
		sc.close();
		 }
		}
