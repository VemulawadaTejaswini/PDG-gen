import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
		String s1="",s2="";
		while(true){
        	s=s.substring(0,s.length()-2);
			s1=s.substring(0,s.length()/2);
			s2=s.substring(s.length()/2);
			if (s1.equals(s2)){
            	System.out.println(s.length());
				break;
            }
        }
    }
}