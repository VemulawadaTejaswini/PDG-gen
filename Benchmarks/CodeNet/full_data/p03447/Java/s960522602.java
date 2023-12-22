import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int x = Integer.parseInt(sc.next());
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int money = x - a;
      System.out.println(money % b);
      //System.out.println(money - b * money / b);
    }
  }
}