import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    String ans = "APPROVED";

    for(int i = 0; i < n; i++){
      int a = sc.nextInt();

      if((a % 2 == 0) && (a % 6 != 0) && (a % 10 != 0)){
        ans = "DENIED";
        break;
      }
    }

    System.out.println(ans);
  }
}