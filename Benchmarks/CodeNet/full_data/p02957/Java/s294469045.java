import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();

    if((a + b) % 2 == 0){
      System.out.println((a + b) / 2);
    }
    else
      System.out.println("Impossible");
  }
}
