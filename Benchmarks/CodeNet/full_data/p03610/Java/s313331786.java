import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		StringBuilder str = new StringBuilder();
		for (int i=0; i<word.length();i=i+2)
		{
			str.append(word.substring(i,i+1));
		}
		System.out.println(str.toString());
	}
}