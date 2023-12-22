import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		boolean bool1 = false,bool2 = false;
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c=='C'){
				bool1 = true;
			}
			if(bool1&&c=='F'){
				bool2 = true;
			}
		}
		if(bool2) System.out.println("Yes");
		else System.out.println("No");

	}

}