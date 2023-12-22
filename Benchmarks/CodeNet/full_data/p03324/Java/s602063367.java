import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String[] datas = str.split(" ");
    int a_i = Integer.parseInt(datas[0]);
    int b_i = Integer.parseInt(datas[1]);
    int tmp = 1;
    for (int i=0;i<a_i;i++) {
      tmp *= 100;
    }
    System.out.println(b_i * tmp);
  }
}