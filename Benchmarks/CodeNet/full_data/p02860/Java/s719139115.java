import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();
    String ans = "Yes";

    if(n % 2 == 1){
      ans = "No";
    } else {
    for(int i = 0; i < (n / 2) - 1; i++){
        if(s.charAt(i) != s.charAt((n / 2) + i)){
          ans = "No";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}
