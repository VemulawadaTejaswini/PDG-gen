
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    int m = cin.nextInt();
    int[] card = new int[n];
    for (int i = 0; i < n; i++) {
      card[i] = cin.nextInt();
    }
    Arrays.sort(card);
    for (int i = 0; i < m; i++) {
      int b = cin.nextInt();
      int c = cin.nextInt();
      for (int j = 0; j < b; j++) {
        if (card[j] < c)
          card[j] = c;
        else
          break;
      }
      Arrays.sort(card);
    }
    long res = 0;
    for (int i : card)
      res += i;
    System.out.println(res);

  }

}
