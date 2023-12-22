import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long m = sc.nextLong();
      if(n*2 > m){
      	System.out.println(n);
        return;
      }
      while(n*2 <= m){
      	m -= 2;
        n++;
      }
      System.out.println(n-1);
    }
}
