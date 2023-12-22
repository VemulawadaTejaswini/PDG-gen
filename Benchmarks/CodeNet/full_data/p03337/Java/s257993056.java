import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int p = a+b;
      int q = a*b;
      int r = a-b;
      int pq = Math.max(p,q);
      int pqr = Math.max(pq,r);
      System.out.println(pqr);
      sc.close();
    }
}