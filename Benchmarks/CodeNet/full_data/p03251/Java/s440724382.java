import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int px = sc.nextInt();
      int py = sc.nextInt();
      int[] x = new int[n];
      int[] y = new int[m];
      int maxX = -1000;
      int minY = 1000;
      for(int i = 0;i < n;i++){
      	x[i] = sc.nextInt();
        maxX = Math.max(maxX,x[i]);
      }
      for(int i = 0;i < m;i++){
      	y[i] = sc.nextInt();
        minY = Math.min(minY,y[i]);
      }
      if(px<py && maxX<minY)System.out.println("War");
      else System.out.println("No War");
    }
}