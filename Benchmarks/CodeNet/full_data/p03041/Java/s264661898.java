import java.util.*;
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
      	int k = sc.nextInt();
      	String s = sc.next();
      	s = s.substring(0,k-1) + s.substring(k-1,k).toLowerCase() + s.substring(k, n);
      	System.out.println(s);
    }
}