import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 整数の入力
String S =sc.next();
char a= S.charAt(0);
char b= S.charAt(1);
char c= S.charAt(2);
int cnt = 0;
if(a!=b){
  cnt++;
}
if(b!=c){
  cnt++;
}
System.out.println(cnt);
  }


}