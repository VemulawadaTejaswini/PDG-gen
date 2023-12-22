import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      int e = sc.nextInt();
      int k = sc.nextInt();
      int max1 = Math.max(b-a,c-b);
      int max2 = Math.max(d-c,e-d);
      int max = Math.max(max1,max2);
      if(max <= k)System.out.println("Yay!");
      else System.out.println(":(");
    }
}