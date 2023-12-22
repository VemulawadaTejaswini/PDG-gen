import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	for(int i=0;i<4;i++) {
		if(s.charAt(i)==s.charAt(i+1)) {
			System.out.println("Yes");
			break;
		}
		else {
			System.out.println("No");
			break;
		}
	}
	

	}

}