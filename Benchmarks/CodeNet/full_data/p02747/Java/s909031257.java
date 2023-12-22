import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int i = 0;
    int x = 0;
    String str = scan.next();
    if(str.contains("hii")){
      x = 1;
    }
    if(str.contains("hi")){
      i = 1;
      if(str.length() > 5 && str.contains("hii")){
        x = 0;
      }
    }
    if(i == 1&& x == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}