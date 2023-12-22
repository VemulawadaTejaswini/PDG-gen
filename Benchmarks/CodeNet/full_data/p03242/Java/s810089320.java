import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String num[] = n.split("");
    for (int i = 0; i < 3; i++){
      if (num[i].equals("1")){
        num[i] = "9";
      }else{
        num[i] = "1";
      }
      System.out.print(num[i]);
    }
  }
}