import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans ="";
		for(int i=1;i<=S.length();i++){
			ans = ans + "x";
		}
		System.out.println(ans);
    }
}