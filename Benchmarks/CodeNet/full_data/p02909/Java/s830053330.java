import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		String a="Sunny";
		String b="Cloudy";
		String c="Rainy";
		if(S.equals(a))
		{
			System.out.println(b);
		}
		else if(S.equals(b))
		{
			System.out.println(c);
		}
		else if(S.equals(c))
		{
			System.out.println(a);
		}

	}

}