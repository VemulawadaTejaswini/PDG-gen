import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long k = in.nextLong();
		if(k==1) System.out.println(s.charAt(0));
		else if(s.charAt(0)=='1') System.out.println(s.charAt(1));
		else System.out.println(s.charAt(0));
		in.close();
	}

}
