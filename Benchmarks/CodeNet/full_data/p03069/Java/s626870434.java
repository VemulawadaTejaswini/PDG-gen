import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.nextLine();
    int w = 0, b = 0;
    for(int i = 0; i < N; i++){
      if(S.charAt(i) == '.'){
        w++;
      }
    }
    
    int ans = N;
    for(int i = 0; i < N; i++){
      if(S.charAt(i) == '#'){
        b++;
      }else{
        w--;
      }
      ans = Math.min(ans, b+w);
    }
    System.out.println(ans);
  }
}