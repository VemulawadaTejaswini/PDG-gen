import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int ans = 0;
    for(int i = 0; i < n; i++){
      for(int j = n; j >= i;j--){
        if(s.substring(i, j).matches("[ACGT]*")){
          int l = s.substring(i, j).length();
          if(l > ans){
            ans = l;
          }
        }
      }
    }
    System.out.println(ans);
  }
}