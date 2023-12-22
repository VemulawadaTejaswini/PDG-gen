import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] s = stdIn.next().split("");
		boolean flag = false;
		Arrays.sort(s);
		
		for(int i = 0; i < s.length-1; i++) {
			if(s[i].equals(s[i+1])) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("no");
		}else {
			System.out.println("yes");
		}
		
	}

}
