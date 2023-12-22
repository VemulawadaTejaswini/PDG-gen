import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String s = scan.nextLine();
      	int size = s.length();
      	String a = s.charAt(0);
      	String z = s.charAt(size - 1);
      	Syste.out.print(a + size - 2 + z);
    }
  
}