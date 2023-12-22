import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      String s = sc.next();
      boolean tobuB = false;
      if(s.substring(b-1,d).contains("..."))tobuB=true;
      if(c==d||s.substring(a-1,Math.max(c,d)).contains("##"))System.out.println("No");
      else if(c<d){
      	if(s.charAt(c-1)=='#'||s.charAt(d-1)=='#')System.out.println("No");
        else System.out.println("Yes");
      }
      else{
        if(s.charAt(c-1)=='#'||s.charAt(d-1)=='#'||(!tobuB))System.out.println("No");
        else System.out.println("Yes");
      }
    }
}
