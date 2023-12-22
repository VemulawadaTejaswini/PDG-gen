import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		String res="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='0') {
				res='0'+res;
			}
			if (s.charAt(i)=='1') {
				res=res+'1';
			}
			if (s.charAt(i)=='B') {
				res=res.substring(0,res.length()-1);
			}
			
		}
		System.out.print(res);
	}
}