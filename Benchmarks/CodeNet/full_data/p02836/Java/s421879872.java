import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int ans = 0;
    for (int i=0;i<(S.length()/2);i++){
      System.out.println("L/R: " + S.charAt(i) + "/" + S.charAt(S.length() -1 -i));
      if (S.charAt(i)!=S.charAt(S.length() -1 -i)){
        ans++;
      }
    }
    System.out.println(ans);
  }
}