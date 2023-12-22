import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		char[] ch = S.toCharArray();
		boolean bool = true;
		for(int i = 0;i < ch.length;i++) {
			if(((i+1)%2==0 && ch[i] =='R') || ((i+1)%2==1 && ch[i] =='L')) {
				bool = false;
			}
		}
		System.out.println(bool ? "Yes" : "No");
	}

}