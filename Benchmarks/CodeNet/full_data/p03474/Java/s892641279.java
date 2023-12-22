
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		
		String s2 = s.substring(0, a);
		String s3 = s.substring(a, a + 1);
		String s4 = s.substring(a + 1);
		
		
 
        // 正規表現のパターンを作成
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(s2);
        Matcher m2 = p.matcher(s4);
 
        if (m.find() && s3.equals("-") && m2.find()) System.out.println("Yes");
        else System.out.println("No");
        
	}
}