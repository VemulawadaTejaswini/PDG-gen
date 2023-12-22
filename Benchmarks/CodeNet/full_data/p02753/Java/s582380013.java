import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    if(input.equals("AAA") || input.equals("BBB")) {
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}