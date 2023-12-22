import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String[] datas = str.split(" ");
    int a_i = Integer.parseInt(datas[0]);
    int b_i = Integer.parseInt(datas[1]);
    if (a_i <= 8 && b_i <= 8) {
      System.out.println("Yay!");
    } else {
      System.out.println(":(");
    }
  }
}