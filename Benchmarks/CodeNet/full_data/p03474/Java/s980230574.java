import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String str = sc.next();
		Pattern p = Pattern.compile("^[0-9]{"+ A +"}-[0-9]{" + B + "}$");
        Matcher m = p.matcher(str);
        if(m.find()) {
        	System.out.println("Yes");
        }else {
            System.out.println("No");
        }
	}

}