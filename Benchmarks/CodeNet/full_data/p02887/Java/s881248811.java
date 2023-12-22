import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // スライムの数
    int slimesCnt = scanner.nextInt();
    // スライムの並び
    String slimes = scanner.next();
    // 出力用
    String output = String.valueOf(slimes.charAt(0));
    
    for (int i = 0; i < slimesCnt - 1; i++){
      if (output.charAt(output.length() - 1) != (slimes.charAt(i + 1))){
        output = output.concat(String.valueOf(slimes.charAt(i + 1)));
      }
    }
    
    System.out.println(output.length());
  }

}
