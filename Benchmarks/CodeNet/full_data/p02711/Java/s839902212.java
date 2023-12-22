import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String n = scan.next();

		if(n.substring(0,1).equals("7") || n.substring(1,2).equals("7") || n.substring(2,3).equals("7")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
