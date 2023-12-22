import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String[] w = scanner.nextLine().split("");
    
    // 何種類文字があるのか
    HashMap<String, Integer> map = new HashMap<>();
    for(String word: w) {
      Integer num = map.get(word);
      if(num == null) {
        map.put(word, 1);
      } else {
      	map.put(word, num + 1);
      }
    }
        
    // その文字が2で割り切れる数あるかどうか
    boolean flg = true;
    for(String key : map.keySet()) {
      if(map.get(key) % 2 != 0) {
        flg = false;
      }
    }
    if(flg) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}