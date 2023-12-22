import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String[] S = new String[n];

    for (int i = 0; i < n; i++) {
      S[i] = sc.next();
    }

    sc.close();

    // count[0]はaの個数、[1]はbの個数、[25]はzの個数
    int[] count = new int[26];

    for (int i = 0; i < S.length; i++) {

      int[] count_ = new int[26];
      
      for (int j = 0; j < S[i].length(); j++) {
        // aのASCIIコードは97
        count_[(int)S[i].charAt(j) - 97]++;
      }
      
      for (int j = 0; j < 26; j++) {
        if (i != 0) {
          count[j] = Math.min(count[j], count_[j]);
        } else {
          count[j] = count_[j];
        }
      }

    }

    for (int i = 0; i < 26; i++) {
      char string = (char) (i + 97);
      for (int j = 0; j < count[i]; j++) {
        System.out.print(string);
      }
    }

    System.out.println("");

  }

}