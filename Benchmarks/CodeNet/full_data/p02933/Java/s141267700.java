p
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

// 標準入力を1行ずつ読み出す。
while (stdin.hasNextLine()) {
    int line1 = Integer.parseInt(stdin.nextLine());
    String line2 = stdin.nextLine();
  System.out.println(line1 >= 3200 ? line2 : "red"); 
}
  }
}