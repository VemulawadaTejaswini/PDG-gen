import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    int l = scanner.nextInt();
    
    ArrayList<String> word = new ArrayList<>();
    
    // N回データを取得し格納する
    for(int i = 0; i < n; i++) {
      word.add(scanner.next());
    }
    
    // データをソートする
    boolean changed = true;
    while(changed) {
      changed = false;
      for(int i = 1; i < n; i++) {
        if(compare(word.get(i), word.get(i - 1))) {
          String tmp; // 退避しておくところ
          tmp = word.get(i);
          word.set(i, word.get(i - 1));
          word.set(i - 1, tmp);
          changed = true;
        }
      }
    }
    
    for(String w: word) {
      System.out.print(w);
    }
  }
  
  
  public static boolean compare(String str1,String str2) {
    return str1.compareTo(str2) < 0;
  }
}
