import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  static String s;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    s = sc.next();
    int n = s.length();

    List< List< Integer > > at = new ArrayList< List< Integer > >(26);
    for(int i = 0; i < 26; i++){
      at.add(new ArrayList< Integer >());
    }

    for(int i = 0; i < n; i++){
      at.get(s.charAt(i) - 'a').add(i);
    }

    for(int i = 0; i < 26; i++){
      List< Integer > list = at.get(i);
      for(int j = 0; j < list.size(); j++){
        int count = 1;
        for(int k = j + 1; k < list.size(); k++){
          int l = list.get(j), m = list.get(k);
          ++count;
          if(m - l >= 1 && 2 * count > m - l + 1){
            System.out.println((l + 1) + " " + (m + 1));
            return;
          }
        }
      }
    }

    System.out.println("-1 -1");
  }
}