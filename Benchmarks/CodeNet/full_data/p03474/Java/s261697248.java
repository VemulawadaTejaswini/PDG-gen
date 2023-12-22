import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		String s = sc.next();
		
		System.out.println(!s.substring(0, a).contains("-") && s.charAt(a) == ('-') && !s.substring(a+1).contains("-") ? "Yes" : "No");
	}
}
