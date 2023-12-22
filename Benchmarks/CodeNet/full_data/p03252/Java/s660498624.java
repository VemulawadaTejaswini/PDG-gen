import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();

      Map<Character, Character> mapping = new HashMap<>();
      Map<Character, Character> mapping2 = new HashMap<>();
      for(int i = 0; i < s.length(); i++) {
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);
        if(mapping.containsKey(c1)) {
          if(mapping.get(c1) != c2) {
            System.out.println("No");
            return;
          }
        } else if (mapping2.containsKey(c2)) {
          if(mapping2.get(c2) != c1) {
            System.out.println("No");
            return;
          }
        } else {
          mapping.put(c1, c2);
          mapping2.put(c2, c1);
        }
      }

      System.out.println("Yes");
  }
}