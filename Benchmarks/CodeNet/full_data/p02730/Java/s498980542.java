import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if(check1(s) && check2(s) && check3(s)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }  
  static boolean check1(String s){
    StringBuffer buf = new StringBuffer(s);
    String str = buf.reverse().toString();
    if(s.equals(str)){
      return true;
    }else{
      return false;
    }
  }
  static boolean check2(String s){
    String str1 = s.substring(0,s.length()/2);
    StringBuffer buf = new StringBuffer(str1);
    String str = buf.reverse().toString();
    if(str1.equals(str)){
      return true;
    }else{
      return false;
    }
  }
  static boolean check3(String s){
    String str1 = s.substring(s.length()/2+1);
    StringBuffer buf = new StringBuffer(str1);
    String str = buf.reverse().toString();
    if(str1.equals(str)){
      return true;
    }else{
      return false;
    }
  }
}