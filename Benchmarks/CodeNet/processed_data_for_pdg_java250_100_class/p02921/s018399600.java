public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		sc.close();
		int ans = 0;
		String[] arrayS = S.split("");
		String[] arrayT = T.split("");
		for(int i=0;i<arrayS.length;i++) {
			if(arrayS[i].equals(arrayT[i])) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
