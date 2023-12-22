import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a1 = sc.nextInt();
      int a2 = sc.nextInt();
      int a3 = sc.nextInt();
      int x = Math.abs(a1-a2);
      int y = Math.abs(a2-a3);
      int z = Math.abs(a3-a1);
      int max = Math.max(x,y);
      int max = Math.max(z,max);
      System.out.println(x+y+z-max);
      sc.close();
    }
}