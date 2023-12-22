import java.util.Scanner;
public class Main {	
	public static void main(String[] args) {
		Scanner frog = new Scanner(System.in);
		String S = frog.next();
		String T = frog.next();
		int s = frog.nextInt();
		int t = frog.nextInt();
		String U = frog.next();
		if(U == S) {
			s=s-1;}
			else {
				t=t-1;}
		System.out.println(s + " " + t);
	}   	
	}
    