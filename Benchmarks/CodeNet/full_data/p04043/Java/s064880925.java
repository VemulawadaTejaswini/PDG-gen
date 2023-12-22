import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    byte A = scan.nextByte();
    byte B = scan.nextByte();
    byte C = scan.nextByte();
    String sa = String.valueOf(A);
    String sb = String.valueOf(B);
    String sc = String.valueOf(C);
    String abc = sa + sb + sc;
    if (abc.contains("5") && abc.contains("7") && abc.contains("5")) {
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }
  }
}