import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      if(s.matches("[A]{0,1}KIH[A]{0,1}B[A]{0,1}R[A]{0,1}"))System.out.println("YES");
      else System.out.println("NO");
    }
}