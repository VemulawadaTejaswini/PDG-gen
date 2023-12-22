import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] h = new int[n];
      for(int i = 0;i < n;i++){
      	h[i] = sc.nextInt();
      }
      int result = 0;
      int[] count = new int[n];
      for(int i = 1;i < n;i++){
      	if(h[i] >= h[i-1]) result++;
        else if(h[i] >= h[i-1]-1 && count[i-1]==0){
          result++;
          count[i]++;
        }
      }
      if(result = n-1)System.out.println("Yes");
      else System.out.println("No");
    }
}