import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int cnt = 0;
      for(int i = 0;i < n;i++){
        int x = sc.nextInt();
        while(x%2==0){
          cnt++;
          x =x/2;
        }
      }
      int s = (int)n/2;
      if(cnt >= s*2)System.out.println("Yes");
      else System.out.println("No");
    }
}
