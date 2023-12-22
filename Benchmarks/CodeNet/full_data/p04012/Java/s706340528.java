import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String inp = in.next();
		boolean w = true;
		for(int i = 0; i < inp.length(); i++) {
			int count = 0;
			for (int j = 0; j < inp.length(); j++){
				if((inp.charAt(i) == inp.charAt(j)))
					count++;
			}
			if (count % 2 != 0){
				w = false;
				break;
			}
		}
		if (w == false)
			System.out.println("No");
		else
			System.out.println("Yes");
		
	}
}