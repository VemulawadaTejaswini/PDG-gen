public class Main {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String S =scan.next();
		String T =scan.next();
		int result =T.indexOf(S);
		if(result==0&&S.length()+1==T.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
