import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String reg = ".";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(s);
		String result = m.replaceAll("x");		
		System.out.println(result);

	}

}