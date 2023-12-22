
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  static int mod = 1000000007;

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int k = cin.nextInt();
    String s = cin.next();
    List<Integer> rec = new ArrayList<>();
    int mark = s.charAt(0) - '0';
    int count = 0;
    int countOne = 0;
    int countZero = 0;
    for (int i = 0; i < s.length(); i++) {
      if (mark == s.charAt(i) - '0') {
        count++;
      } else if (mark != s.charAt(i) - '0' && mark == 0) {
        rec.add(-count);
        count = 1;
        mark = 1;
        countZero++;
      } else if (mark != s.charAt(i) - '0' && mark == 1) {
        rec.add(count);
        count = 1;
        mark = 0;
        countOne++;
      }

      if (i == s.length() - 1 && mark == 1) {
        rec.add(count);
        countOne++;
      } else if (i == s.length() - 1 && mark == 0) {
        rec.add(-count);
        countZero++;
      }
    }

//    for (int i : rec) {
//      System.out.println(i);
//    }
//    System.out.println(countOne);
//    System.out.println(countZero);

    if (k == 0) {
      System.out.println(Math.max(Collections.max(rec),0));
      return;
    }

    if (k >= countZero) {
      System.out.println(s.length());
      return;
    } else {
      int maxLen = 0;
      for (int i = 0; i < countZero - k + 1; i++) {
        int temp = 0;

        if (rec.get(i*2)>=0) {
          for (int j = i * 2; j < Math.min(k * 2 + 1 + i * 2, rec.size()); j++) {
            temp += Math.abs(rec.get(j));
          }
        }
        else if (rec.get(i*2)<0 && i!=0){
          for (int j = Math.max(i * 2 - 1, 0); j < Math.min(k * 2 + i * 2, rec.size()); j++) {
            temp += Math.abs(rec.get(j));
          }
        }
        else {
          for (int j = Math.max(i * 2 - 1, 0); j < Math.min(k * 2 + i * 2, rec.size()); j++) {
            temp += Math.abs(rec.get(j));
          }
        }

        System.out.println(temp);
        if (temp >= maxLen) {
          maxLen = temp;
        }
      }
      System.out.println(maxLen);
    }

  }


}
