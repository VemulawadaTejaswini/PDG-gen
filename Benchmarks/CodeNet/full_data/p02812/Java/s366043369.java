import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String s = sc.next();
    int ans = (size - s.replaceAll("ABC", "").length()) / 3;
    System.out.println(ans);
  }
}
