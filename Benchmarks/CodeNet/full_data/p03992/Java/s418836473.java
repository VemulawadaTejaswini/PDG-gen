import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
	        s = s.substring(0, 4) + " " + s.substring(4);
		System.out.println(s);
	}
}