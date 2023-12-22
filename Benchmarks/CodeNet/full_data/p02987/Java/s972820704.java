import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		char[] s_chars = s.toCharArray();
        Arrays.sort(s_chars);

      if(s_chars[0]==s_chars[1]&&s_chars[2]==s_chars[3]&&s_chars[0]!=s_chars[2]){
        System.out.print("Yes");
      }else{System.out.print("No");}
      
	}
}