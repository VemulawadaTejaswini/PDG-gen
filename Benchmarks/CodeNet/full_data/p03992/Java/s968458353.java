import java.util.Scanner;


public class Main {
	public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String s="CodeFestival";
    //String s = in.nextLine();
    if (s.length()<7)
    	System.out.println(s);
    	else {
			System.out.println(s.substring(0, 4)+" "+s.substring(5, s.length()));
		}
}
}
