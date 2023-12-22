import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();

    sc.close();

    int[] count = new int[26];

    for (int i = 1; i < S.length(); i++) {
      Arrays.fill(count, 0);
      for (int j = 0; j < S.length() - i; j++) {
        count[(int) S.charAt(j) - 97]++;
      }
      boolean valid = true; 
      for (int j = 0; j < 26; j++) {
        if(count[j] % 2 != 0){
          valid = false;
          break;
        }
      }
      if (valid) {
        System.out.println(S.length() - i);
        break;
      }
    }

  }

}