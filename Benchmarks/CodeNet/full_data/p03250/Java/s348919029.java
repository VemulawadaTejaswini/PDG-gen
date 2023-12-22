import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int ab = Math.max(a,b);
      int max = Math.max(ab,c);
      System.out.println(max*10+a+b+c-max);
      sc.close();
    }
}