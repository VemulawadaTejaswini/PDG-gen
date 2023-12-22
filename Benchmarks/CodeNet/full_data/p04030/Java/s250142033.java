import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Character> caca = new ArrayList<Character>();
		String n = scn.next();
		for(int i = 0;i<n.length();i++) {
			if(n.charAt(i)=='1')caca.add('1');
			else if(n.charAt(i)=='0')caca.add('0');
			else if(n.charAt(i)=='B') {
				if(!caca.isEmpty())caca.remove(caca.size()-1);
			}
		}for(int i = 0;i<caca.size();i++)System.out.print(caca.get(i));
		System.out.println();
		scn.close();
	}
}