import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
      	String b = in.next();
      	int cnt = 0;
      
      if(a.charAt(0)==b.charAt(0)){cnt++;}
       if(a.charAt(1)==b.charAt(1)){cnt++;}
       if(a.charAt(2)==b.charAt(2)){cnt++;}
      
      System.out.print(cnt);
      
      
      
	}
}