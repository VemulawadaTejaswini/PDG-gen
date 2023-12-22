import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int cnt_N =0;
    int cnt_S =0;
    int cnt_E =0;
    int cnt_W =0;
    
    for(int i=0; i<S.length(); i++){
      if(S.charAt(i)=='N')cnt_N++;
      else if(S.charAt(i)=='S')cnt_S++;
      else if(S.charAt(i)=='E')cnt_E++;
      else if(S.charAt(i)=='W')cnt_W++;
    }
    if(cnt_N = cnt_S && cnt_E = cnt_W){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}   