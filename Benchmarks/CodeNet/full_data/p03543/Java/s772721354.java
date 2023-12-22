import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String S = sc.next();
		//int N = sc.nextInt();
		//System.out.println();
		String s = sc.next();
		System.out.println(s.matches("[0-9]?[0-9]{3,4}[0-9]?") ? "Yes":"No")
	}
}
