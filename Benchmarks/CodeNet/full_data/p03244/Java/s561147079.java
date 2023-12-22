
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int count = cin.nextInt();
    int[] ar = new int[count];
    int[] temp = new int[count];
    int min = Integer.MAX_VALUE;
    int mark = 0;
    for (int i=0;i<count;i++){
      ar[i] = cin.nextInt();
      if (i>0) {
        if (ar[i]!=ar[i-1]) mark = 1;
      }
    }
    if (mark == 0) {
      System.out.println(count/2);
      return;
    }
    for (int i=0;i<count/2;i++){
      int a = ar[i*2];
      int b = ar[i*2+1];
      if (a!=b) {
        for (int j = 0; j < count; j++) {
          if (j % 2 == 0) temp[j] = a;
          else temp[j] = b;
        }
        int diff = 0;
        for (int j = 0; j < count; j++) {
          if (ar[j] != temp[j]) diff++;
        }
        if (diff < min) min = diff;
      }
    }

    System.out.println(min);
  }

}
