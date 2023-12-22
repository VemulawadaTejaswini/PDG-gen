import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long n = (long) sc.nextInt();
      long x = lucas(n);
      System.out.println(x);
    }
  	public static long lucas(long n){
    	if(n == 0)return 2;
      else if(n == 1)return 1;
      else return lucas(n-1)+lucas(n-2);
    }
}