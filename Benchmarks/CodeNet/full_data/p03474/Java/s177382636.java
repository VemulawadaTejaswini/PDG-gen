import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String postCode = sc.next();
		Pattern p = Pattern.compile("^[0-9]{" + a + "}-^[0-9]{" + b + "}");
		int index = postCode.indexOf("-");
		Matcher m = p.matcher(postCode);
		if(m.find()){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
