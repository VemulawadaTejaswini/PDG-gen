import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int ans = 0;

      if(n==1){
        ans = 1;
      }
      if(n==2){
        ans = 8;
      }
      if(n>=3){
        ans = (n*(n-1)*(n-2)/6)*27;
      }

      System.out.println(ans);

    }
}
