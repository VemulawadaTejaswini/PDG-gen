import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[ACGT]+");
		Scanner s = new Scanner(System.in);
		
		int result = 0;
		
		String inS = s.next();
		Matcher m = p.matcher(inS);
		for(int i=0;i<inS.length();i++) {
			if(m.find(i)) {
				int length = m.group().length();
				if(result < length) {
					result = length;
				}
			}
		}
		
		System.out.println(result);
		s.close();
		
	}

}