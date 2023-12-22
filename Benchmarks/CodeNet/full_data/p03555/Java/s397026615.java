
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int res = 0;

	public static void main(String[] args) throws Exception {


		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(helper(str1,str2));

	}
	private static String helper(String str1, String str2) {
		// TODO Auto-generated method stub
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(str2.length()-1-i))
				return "NO";
		}
		return "YES";
	}
}