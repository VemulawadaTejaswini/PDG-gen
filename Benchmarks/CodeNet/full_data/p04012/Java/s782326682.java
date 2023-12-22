import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String w = in.next();
		
		boolean f = true;
		for (int i =0;i<w.length();i++) {
			int c=0;
			for (int j =0;j<w.length();j++) {
				if (w.charAt(i)==w.charAt(j)) {
					c++;}}
			if (c%2!=0) {
				f= false;
				break;}}
		if(f) {
			System.out.println("yes");}
		else {
			System.out.println("No");
		}
		}
	
}
