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
      if(c==d)System.out.println("No");
      else if(c<d){
      	if((s.charAt(c-1)=='#'&&s.charAt(c-2)=='#')||(s.charAt(d-1)=='#'&&s.charAt(d-2)=='#'))System.out.println("No");
        else System.out.println("Yes");
      }
      else{
        boolean tobu = false;
      	for(int i = b;i < d-1;i++){
        	if(s.charAt(i-2)=='.'&&s.charAt(i-1)=='.'&&s.charAt(i)=='.')tobu = true;
        }
        if((s.charAt(c-1)=='#'&&s.charAt(c-2)=='#')||(s.charAt(d-1)=='#'&&s.charAt(d-2)=='#')||!tobu)System.out.println("No");
        else System.out.println("Yes");
      }
    }
}
