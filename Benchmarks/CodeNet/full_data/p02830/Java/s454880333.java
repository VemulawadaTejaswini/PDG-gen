import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		 int nam = in.nextInt();
		 
		String s = in.next();
		char[] s_chars = s.toCharArray();
		
		String t = in.next();
		char[] t_chars = t.toCharArray();
		
		for(int i = 0;i < nam; i++){
		    System.out.print(s_chars[i]);
		    System.out.print(t_chars[i]);
		}


      
	}
}