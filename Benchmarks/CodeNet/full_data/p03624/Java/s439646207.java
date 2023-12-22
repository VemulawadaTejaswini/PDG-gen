import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int[] n = new int[s.length()];
    for (int i = 0; i <s.length(); i++) {
      n[i] = (int) (s.charAt(i) - 'a');
    }
    int[] m = new int[26];
    for (int i = 0; i < s.length(); i++) {
      m[n[i]]++;
    }
    for (int i =0; i < s.length(); i++) {
      if (m[i] == 0) {
        System.out.println((char) (i + 'a'));
        return;
      }
    }
    System.out.println("None");
  }
}