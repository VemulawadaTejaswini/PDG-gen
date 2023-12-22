import java.util.*;
public class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char a1 = a.charAt(0);
		a1=Character.toLowerCase(a1);
		int ascii = (int) a1;
		if(ascii!=97) {
		ascii++;
		char res = (char) ascii;
		System.out.println(res);
		}
	}	
}

