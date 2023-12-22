import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static boolean check(String s1,String s2){
    if(s1.length() != s2.length())
      return false;
    int[] letters = new int[256];
    char[] s_array = s1.toCharArray();
    for(char c : s_array)
      letters[c]++;
    for(int i = 0; i < s2.length(); i++) {
      int c = (int) s2.charAt(i);
      if(--letters[c] < 0)
        return false;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] s = new String[sc.nextInt()];
    Arrays.setAll(s, i -> sc.next());
    List<String> list = Arrays.asList(s);
    int count = 0;
    for (int i = 0; i < list.size(); i++)
      for (int j = i + 1; j < list.size(); j++)
        if (i != j)
          if (check(list.get(i), list.get(j)))
            count++;
    System.out.println(count);
  }
}