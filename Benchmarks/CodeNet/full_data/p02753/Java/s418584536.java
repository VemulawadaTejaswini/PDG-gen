import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		char[] c=S.toCharArray();
			if(c[0]==c[1] && c[1]==c[2]){
				System.out.println("No");
			}
			else {
				System.out.println("Yes");
			}
	}
}