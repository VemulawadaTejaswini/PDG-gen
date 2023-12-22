import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		int check=0;
		if(s.charAt(0)=='A') {
			for(int i=2;i<s.length()-2;i++) {
				if(s.charAt(i)=='C') {
					check+=1;

				}
			}
		}
		if(check==1)System.out.println("AC");
		else System.out.println("WA");
	}
}