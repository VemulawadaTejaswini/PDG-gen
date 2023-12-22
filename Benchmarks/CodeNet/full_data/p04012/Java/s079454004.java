import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String w = s.nextLine();
    boolean ans = solve(w);
    if(ans)
      System.out.println("Yes");
    else
      System.out.println("No");
  }

  public static boolean solve(String w){
    boolean ans = true;
    int even = 0;
    for(int i = 0; i < w.length() ; i++){
      for(int j = 0; j < w.length() ; j++){
        if(w.charAt(i) == w.charAt(j))
          even += 1;
      }
      if(even % 2 != 0 ){
        ans = false;
        break;
      }
    }
    return ans;
  }
}
