import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int x = sc.nextInt();
      if(a+b < x && a <= x) System.out.println("NO");
      else System.out.println("YES");
      sc.close();
    }
}
