import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
      	if(s.length() != 6) {
          return;
        }
      //coffee
      	String s2 = s.substring(2,3);
        String s3 = s.substring(3,4);
      	String s4 = s.substring(4,5);
      	String s5 = s.substring(5,6);
      
        if(s2.equals(s3) && s4.equals(s5)) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
    }
}