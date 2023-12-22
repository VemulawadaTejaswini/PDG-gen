import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		String s;
		String a=input.nextLine();
		do {
			s=input.nextLine();
		}while(s.length()<1||s.length()>100);
		String c=input.nextLine();
		System.out.println("A"+s.charAt(0)+"C");
	}
}