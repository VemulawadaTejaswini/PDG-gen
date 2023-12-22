import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		int cnt=0;
		for(int i=0;i<s.length();i++)if(s.charAt(0)=='o')cnt++;
		System.out.println(700+100*cnt);
	}
}