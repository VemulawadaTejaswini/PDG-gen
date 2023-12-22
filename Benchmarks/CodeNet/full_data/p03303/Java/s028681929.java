import java.util.Scanner;
public class Main {
	public static void main(String[] args) {	 
		Scanner in = new Scanner(System.in);
		String s = in.next(), ans = "";
		int x = in.nextInt();
		for (int i = 0; i < s.length(); i += x){
		    ans += "" + s.charAt(i);
		}
		System.out.print(ans);
	}
}	
	
