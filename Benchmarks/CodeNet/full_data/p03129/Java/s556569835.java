import java.util.*;

public class Main{
	public static void main(String[] args) {
     
      Scanner in =new Scanner(system.in);
      int n=in.nextInt();
      int k=in.nextInt();
      
      if (n%2==1){
        if (k>n/2+1)system.out.println("NO");
        else system.out.println("YES");
      }
      else if (k>n/2)system.out.println("NO");
      else system.out.println("YES");
      return;
    }
}
