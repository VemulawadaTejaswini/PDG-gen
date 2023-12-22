import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.nextLine());
		String x = sc.nextLine();
		
		Pattern p = Pattern.compile("ABC");
		Matcher m = p.matcher(x);
		int count = 0;
		while(m.find()) {
			count++;
		}
		System.out.println(count);
	}		
}