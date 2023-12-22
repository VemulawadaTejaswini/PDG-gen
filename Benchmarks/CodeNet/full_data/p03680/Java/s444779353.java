import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i] = sc.nextInt();
      int count = 0;
      int point = 1;
      while(point != 2){
      	count++;
        point = a[point-1];
        if(point == 1){
          count = -1;
          break;
        }
      }
      System.out.println(count);
    }
}