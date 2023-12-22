import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    char[] s = new char[S.length()];
    char[] t = new char[T.length()];
    char a;
    for(int j = 0; j < S.length(); j++){
      s[j] = S.charAt(j);
      t[j] = T.charAt(j);
    }
    boolean p = true;
    int i = 0;
    while(i < S.length()){
      for(int j = 0; j < S.length(); j++){
        if(s[j] != t[j])
          p = false;
      }
      if(p)
        break;
      i++;
      if(!p){
        a = s[S.length - 1];
        s[S.length - 1] = s[0];
        s[0] = a;
      }
    }
    if(p)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}      
