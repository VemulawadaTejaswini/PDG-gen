import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long a = sc.nextLong();
      long b = sc.nextLong();
      if(a>=b)System.out.println(0);
      else System.out.println(b*(n-2)-a*(n-2)+1);
    }
}
