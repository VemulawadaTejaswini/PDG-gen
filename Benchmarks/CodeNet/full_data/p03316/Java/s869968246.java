import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = n;
      int s = 0;
      while(n>=1){
      	s += n%10;
        n = n/10;
      }
      if(x%s==0&&s!=0)System.out.println("Yes");
      else System.out.println("No");
    }
}
