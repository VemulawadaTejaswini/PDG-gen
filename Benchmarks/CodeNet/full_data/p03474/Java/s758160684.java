import java.util.Scanner;
import java.util.regex.Pattern;

// Java8
public class Main
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}

	void run()
	{
		int a = sc.nextInt();
		int b = sc.nextInt();
		Pattern ptn = Pattern.compile("\\d{" + a + "}-\\d{" + b + "}");
		String s = sc.next();
		System.out.println(ptn.matcher(s).matches() ? "Yes" : "No");
	}
}
