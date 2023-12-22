import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String ans = "No";

    if(n % 10 == 7){
      ans = "Yes";
    } else if((n / 10) % 10 == 7){
      ans = "Yes";
    } else if(n / 100 == 7){
      ans = "Yes";
    }

    System.out.println(ans);
  }
}
