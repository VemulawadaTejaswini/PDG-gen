import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int n = s.length();
    int ans = 0;
    
    for(int i = 0; i < n; i++){
      for(int j = n; j > i; j--){
        String s1 = s.substring(i, j);
        if(s1.matches("[ACGT]*")){
          ans = s1.length();
          break;
        }
      }
      if(ans != 0){
        break;
      }
    }
    System.out.println(ans);
  }
}
