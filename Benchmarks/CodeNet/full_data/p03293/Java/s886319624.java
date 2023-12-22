import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      int count = 0;
      for(int i = 0;i <= s.length();i++){
      	if(s.equals(t))count++;
        s = s.substring(s.length()-1,s.length())+s.substring(0,s.length()-1);
      }
      if(count > 0)System.out.println("Yes");
      else System.out.println("No");
    }
}