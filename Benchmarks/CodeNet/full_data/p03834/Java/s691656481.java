import java.util.Scanner;
public class Main {
	private static Scanner stdIn;
	public static void main(String args[]){
		stdIn = new Scanner(System.in);
		String s = stdIn.next();
		String a = s.substring(0,5);
		String b = s.substring(6,13);
		String c = s.substring(14);
		
		System.out.println(a+' '+b+' '+c);
	}

}