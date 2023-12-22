import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int[] charCnt = new int[26];
  	
    for (char c: s.toCharArray()) {
      charCnt[c - 'a']++;
    }
    
    for (int i = 0; i < 26; i++) {
      if (charCnt[i] == 0) {
        System.out.println(("None"));
        System.exit(0);
      }
    }
    
    System.out.println((i + 'a'));
    System.exit(0);
  }
}