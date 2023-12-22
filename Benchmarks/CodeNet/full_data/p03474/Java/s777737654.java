import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int num1 = sc.nextInt();
        int num2 = sc.nextInt();
		String pc = sc.next();
        Pattern p = Pattern.compile("^[0-9]{"+ num1 +"}-[0-9]{"+ num2 +"}$");
        Matcher m = p.matcher(pc);
        if(m.find()){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}