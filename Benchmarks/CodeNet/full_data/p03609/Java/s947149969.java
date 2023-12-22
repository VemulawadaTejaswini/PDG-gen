import java.util.*;
public class Main{
  	public static void main (String [] args){
      	Scanner scanner = new Scanner (System.in);
        String in = scanner.next();
     	String out = "";
      	for (int i = 0; i < in.length(); i+=2){
          	out = out + in.charAt(i);
        }
      	System.out.println(out);
    }
}