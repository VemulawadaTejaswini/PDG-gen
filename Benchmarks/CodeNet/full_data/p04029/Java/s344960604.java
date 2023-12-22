import java.util.*;

public class Main {
  public static void main(String[] args) {
  	Scanner scanner = new Scanner(System.in);
    // 値の入力
    int number = scanner.nextInt();
    
    // N人の子供それぞれのキャンディーを合計していく
    int sum = 0;
    for(int i = 1; i <= number; i++) {
      sum += i; 
    }
    
    // キャンディーの合計数を出力
    System.out.println(sum);
  }
}