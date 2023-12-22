import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int n = s.length();
    long ans = 0;

    for(int i = 0; i < n; i++){
      for(int j = n; j > i + 2; j--){
        long l = Long.valueOf(s.substring(i, j));
        if(l % 2019 == 0){
          ans += 1;
        }
      }
    }

    System.out.println(ans);
  }
}
