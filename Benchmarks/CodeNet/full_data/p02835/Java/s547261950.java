import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt();
    int a2 = sc.nextInt();
    int a3 = sc.nextInt();
    
    if(a1 <= 13 && a1 >= 1  && a2 <= 13 && a2 >= 1 && a3 <= 13 && a3 >= 1){
      if(a1 + a2 + a3 >= 22){
      System.out.println("bust");
      }else {
      System.out.println("win");
      }
    }else{
      System.out.println("入力条件を満たしていません");
    }
  }
}