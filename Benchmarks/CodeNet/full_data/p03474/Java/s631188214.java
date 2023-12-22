import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		String s = scan.next();
		scan.close();
		int check=0;
		for(int i=0;i<a+b+1;i++) {
			if(s.charAt(i)=='-' &&i!=a ) {
				check=1;
			}
		}

		System.out.println((check==1)? "No":"Yes");
	}

}
