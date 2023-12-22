import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	
      	String n = sc.next();
      	boolean con = true;
      
      	for(int i = 0;i < n.length() && con;i++){
          if(n.charAt(i) == '7') con = false;
        }
      
      	if(con) System.out.println("No");
      	else System.out.println("Yes");
        
	}
}
