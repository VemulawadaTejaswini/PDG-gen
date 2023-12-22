import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		sc.close();


		if(S.substring(0,1).equals("1")){
			System.out.println(S.substring(1,2));
		}
		else{
			System.out.println(S.substring(0,1));
		}
	}
}
