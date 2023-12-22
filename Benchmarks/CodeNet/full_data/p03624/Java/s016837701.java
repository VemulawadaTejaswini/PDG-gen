import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] alpha = new char[26];
    for(int i = 0; i < 26; i++){
      alpha[i] = (char)(97 + i);
    }
    int[] count = new int[26];
    String ans = "None";
    for(int i = 0; i < s.length(); i++){
      for(int j = 0; j < 26; j++){  
        if(s.charAt(i) == alpha[j]) {
          count[j]++;
          break;
        }
      }
    }
    for(int i = 0; i < 26; i++){  
      if(count[i] == 0) {
        ans =String.valueOf(alpha[i]);
        break;
      }
    }
    System.out.println(ans);
  }
}