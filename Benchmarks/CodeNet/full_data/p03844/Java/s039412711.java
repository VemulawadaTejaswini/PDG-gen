import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String str = sc.next();
    int b = sc.nextInt();
    if(str.charAt(0) == '+'){
      int tmp = a + b;
      System.out.println(tmp);
    }else{
      int tmp = a - b;
      System.out.println(tmp);
    }
  }
}