import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Atcoderは固定なので捨て
    scanner.next();
    
    // 2つ目の単語を取得
    String word = scanner.next();
    
    // 単語の頭文字を取得
    String head = word.split("")[0];
    
    // "A" + head + "C" を出力
    System.out.println("A" + head + "C");
  }
}