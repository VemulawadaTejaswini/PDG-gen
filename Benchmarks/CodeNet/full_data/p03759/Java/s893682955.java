import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String o = sc.nextLine();

		String e = sc.nextLine();

		int oLength = o.length();
		int eLength = e.length();

		String pw = "";

		for(int i=0; i<oLength; i++){
			pw = pw + o.charAt(i);
			if( i<eLength){
				pw = pw + e.charAt(i);
			}
		}

		System.out.println(pw);
	}
}