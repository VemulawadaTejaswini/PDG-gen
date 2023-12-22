import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String[] datas = str.split(" ");
    int a_i = Integer.parseInt(datas[0]);
    int b_i = Integer.parseInt(datas[1]);
    int tmp = 100 * a_i; 
    if (tmp == 0) {
      System.out.println(b_i);
    } else {
      System.out.println(b_i * tmp);
    }
  }
}