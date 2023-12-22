import java.util.*;

public class Main{

  static boolean check1(String s){
    for(int i=0; i<s.length()/2; i++){
      if (!(s.charAt(i) == s.charAt(s.length()-1-i)))
        return false;
    }
    return true;
  }

  static boolean check2(String s){
    for(int i=0; i<(s.length()-1)/4; i++){
      if (!(s.charAt(i) == s.charAt((s.length()-1)/2 -1-i)))
        return false;
    }
    return true;
  }

  static boolean check3(String s){
    for(int i=(s.length()+3)/2-1; i<s.length(); i++){
      if (!(s.charAt(i) == s.charAt(s.length()-1-i)))
        return false;
    }
    return true;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    if(check1(s) && check2(s) && check3(s))
      System.out.println("Yes");
    else 
      System.out.println("No");
  }
}
