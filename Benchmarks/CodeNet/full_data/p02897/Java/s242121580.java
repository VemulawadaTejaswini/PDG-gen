import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double n = sc.nextDouble();

      double check;

      if(n%2==0){
        check = n;
      }
      else{
        check = n+1;
      }

      double ans = (check/2)/n;


      System.out.println(ans);

    }
}
