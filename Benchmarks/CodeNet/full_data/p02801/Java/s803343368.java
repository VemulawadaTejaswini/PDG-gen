import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String n=sc.next();
		String[] s= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int i=0;i<s.length;i++) {
			if(n.equals(s[i])) {
				System.out.println(s[i+1]);
			}
		}
		
		sc.close();
	}
}