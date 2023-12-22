import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next(); //例：Main
    String array[] = new String[str.length()];
    String before = str.substring(0, 1);
    String here = "";
    boolean isGood = true;
    for (int i = 1; i < array.length; i++) {
      here = str.substring(i, i + 1);
      if(here.equals(before)){
        isGood = false;
        break;
      }
      before = str.substring(i, i + 1);
    }
    if(isGood){
      System.out.println("Good");   
    }else{
      System.out.println("Bad");   
    }
  }
}
