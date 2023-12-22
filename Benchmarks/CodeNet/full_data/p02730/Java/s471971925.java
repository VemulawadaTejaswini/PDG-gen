import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    char a[] = s.toCharArray();
    boolean ans = true;
    int j = ((len - 1) / 2) - 1;
    for(int i = 0;;i++){
      if(a[i] != a[j]) ans = false;
      j--;
      if(i >= j){
        break;
      }
    }
    int y = ((len + 3) / 2) - 1;
    for(int x = len - 1;;x--){
      if(a[x] != a[y]) ans = false;
      y++;
      if(x <= y){
        break;
      }
    }
    if(ans){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}