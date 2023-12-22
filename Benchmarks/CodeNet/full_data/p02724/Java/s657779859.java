import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int money = Integer.parseInt(str);
    int happy = 0;
    happy += (money / 500) * 1000;
    happy += ((money % 500)/5) * 5;
    System.out.println(happy);
  }
}
