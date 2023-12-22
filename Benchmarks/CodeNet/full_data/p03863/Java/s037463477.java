import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		int leng=string.length();
		int u=2;
		if (string.charAt(0)==string.charAt(leng-1)) {
			u=3;
		}
		if ((leng-u)%2==0) {
			System.out.println("Second");
		}else {
			System.out.println("First");
		}
	}

}