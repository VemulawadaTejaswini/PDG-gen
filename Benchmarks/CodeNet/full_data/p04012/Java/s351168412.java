import java.util.*;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		HashSet<Character> hash = new HashSet<Character>();
		char c;
		Boolean flag = true;
		if(s.length() % 2 != 0)
			flag = false;
		else{
			for(int i = 0; i < s.length(); i++){
				c = s.charAt(i);
				if(!hash.contains(c))hash.add(c);
				else hash.remove(c);
			}
		}
		if(!flag)System.out.print("No");
		else if(hash.size()==0)System.out.print("Yes");
		else System.out.print("No");
	}

}
