import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc  = new Scanner(System.in);
      	String s = sc.next();
      	String t = "";
      	for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == '0') t+= "0";
          	else if(s.charAt(i) == '1') t+= "1";
          	else if(s.charAt(i) == 'B' && t.length()>=1)
              t = t.substring(0, (t.length()-1));
    
        }
      
      	System.out.println(t);
    }
}