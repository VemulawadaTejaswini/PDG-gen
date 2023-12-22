import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = S.replace("dreamer", "");
		String ans2 = ans.replace("eraser", "");
		String ans3 = ans2.replace("dream", "");
		String ans4 = ans3.replace("erase", "");
		System.out.println(ans4.equals("") ? "YES" :"NO");
	}
}