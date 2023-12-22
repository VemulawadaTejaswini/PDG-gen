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

    for(int i = 0; i < n; i++){
      int count = 1;
      List< Integer > list = at.get(s.charAt(i) - 'a');
      int j = Collections.binarySearch(list, i) + 1;
      for(int m = list.size(); j < m; j++){
        int k = list.get(j);
        ++count;
        if(2 * count > k - i + 1){
          System.out.println((i + 1) + " " + (k + 1));
          return;
        }
      }
    }

    System.out.println("-1 -1");
  }
}