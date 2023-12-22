import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    long c = a*500;

    if (c >= b){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
