import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();

    sc.close();

    String[] arr = S.split("");

    int countA = 0;

    for (int i = 0; i < arr.length; i++) {
      
      if (i % 2 == 0) {
        if (arr[i].equals("1")) {
          countA++;
        }
      } else {
        if (arr[i].equals("0")) {
          countA++;
        }
      }

    }

    int countB = 0;

    for (int i = 0; i < arr.length; i++) {
      
      if (i % 2 == 0) {
        if (arr[i].equals("0")) {
          countB++;
        }
      } else {
        if (arr[i].equals("1")) {
          countB++;
        }
      }

    }

    if (countA < countB) {
      System.out.println(countA);
    } else {
      System.out.println(countB);
    }
    
  }

}