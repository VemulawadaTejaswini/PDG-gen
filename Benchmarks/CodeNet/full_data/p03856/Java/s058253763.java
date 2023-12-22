import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String S = sc.next();
		while(!S.isEmpty()) {
			// dream dreamer erase eraser
			if(S.endsWith("dream") || S.endsWith("erase")) {
				S = S.substring(0, S.length() - 5);
			}else if(S.endsWith("dreamer")) {
				S = S.substring(0, S.length() - 7);
			}else if(S.endsWith("eraser")) {
				S = S.substring(0, S.length() - 6);
			}else {
				break;
			}
		}
		System.out.println(S.isEmpty() ? "YES" : "NO");
	}
}