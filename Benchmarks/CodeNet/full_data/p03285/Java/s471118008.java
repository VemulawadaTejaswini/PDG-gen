import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String ans = "No";

    for(int i = 0; i * 4 <= N; i++){
      int M = N - i * 4;
      if(M % 7 == 0){
        ans = "Yes";
        break;
      }
    }

    System.out.println(ans);
  }
}
