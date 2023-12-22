import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String[] s = new String[3];
  for(int i = 0;i < 3;i++){
    s[i] = sc.next();
  }
  String[] t = new String[3];
for(int i = 0;i < 3;i++){
  t[i] = s[i].toUpperCase();
}
  String u = (t[0].charAt(0),t[1].charAt(0),t[2].charAt(0));
  System.out.println(u);
}
}
