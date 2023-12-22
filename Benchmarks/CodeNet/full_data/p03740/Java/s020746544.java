import java.util.Scanner;

public class Main{
  static long x, y;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    x = sc.nextLong();
    y = sc.nextLong();

    if((x == 0 && y == 0) ||
      (x == 0 && y == 1) || (x == 1 && y == 0)
      || (x == 1 && y == 1)){
      System.out.println("Brown");
      return;
    }

    if(x == 0 || y == 0){
      System.out.println("Alice");
      return;
    }

    if(x % 2 != y % 2){
      System.out.println("Brown");
    }
    else{
      System.out.println("Alice");
    }
  }
}
