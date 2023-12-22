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
      if(s.substring(a-1,c).contains("##"))System.out.println("No");
      else if(s.substring(b-1,d).contains("##"))System.out.println("No");
      else if(c<d)System.out.println("Yes");
      else{
        if(s.substring(b-2,d+1).contains("..."))tobuB=true;
        if(tobuB)System.out.println("Yes");
        else System.out.println("No");
      }
    }
}
