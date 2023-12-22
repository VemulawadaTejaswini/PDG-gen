import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  String s = sc.next();
	  String t = sc.next();
	  String ans = "No";
	  for(int i = 0; i < s.length(); i++) {
		  String a = s.substring(0,1);
		  s = s.substring(1);
		  s += a;
		  if(s.equals(t)) {
			  ans = "Yes";
			  break;
		  }
	  }
	  System.out.println(ans);
	}
}