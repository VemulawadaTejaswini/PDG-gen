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
      	for(int i = b;i < d;i++){
        	if(s.charAt(i-2)=='.'&&s.charAt(i-1)=='.'&&s.charAt(i)=='.')tobuB = true;
        }
      boolean pA = false;
      boolean pB = false;
      for(int i = a;i < c;i++)if(s.charAt(i-1)=='#'&&s.charAt(i)=='#')pA=true;
      for(int i = b;i < d;i++)if(s.charAt(i-1)=='#'&&s.charAt(i)=='#')pB=true;
      if(c==d)System.out.println("No");
      else if(c<d){
      	if(pA||pB||s.charAt(c-1)=='#'||s.charAt(d-1)=='#')System.out.println("No");
        else System.out.println("Yes");
      }
      else{
        if(pA||pB||s.charAt(c-1)=='#'||s.charAt(d-1)=='#'||(!tobuB))System.out.println("No");
        else System.out.println("Yes");
      }
    }
}
