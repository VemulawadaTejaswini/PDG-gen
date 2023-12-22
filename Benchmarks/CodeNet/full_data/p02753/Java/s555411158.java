import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 整数の入力
String S =sc.next();
char a= S.charAt(0);
char b= S.charAt(1);
char c= S.charAt(2);
if(a!=b || b!=c){
  System.out.println("Yes");
}
else{
  System.out.println("No");
}

  }


}
